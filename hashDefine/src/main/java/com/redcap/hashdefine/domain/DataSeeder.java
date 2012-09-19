package com.redcap.hashdefine.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataSeeder implements ApplicationListener<ContextRefreshedEvent>{

        private static final String EXTRACT_JSON = "extract.json";
        
        private String getResourceAsString(String filename) throws IOException {
        	StringBuffer buffer = new StringBuffer();
        	InputStream is = this.getClass().getClassLoader().getResourceAsStream(filename);
        	BufferedReader br = new BufferedReader(new InputStreamReader(is));
        	return br.readLine();          
        }


		@Override
        @Transactional
        public void onApplicationEvent(ContextRefreshedEvent event) {
            System.out.println("before: " + Ticket.countTickets());
            
            String jsonTickets;
			try {
				jsonTickets = getResourceAsString(EXTRACT_JSON);
				Collection<Ticket> tickets = Ticket.fromJsonToArray(jsonTickets);
				for (Ticket ticket: tickets) {
					ticket.persist();
				}
			} catch (IOException e) {
				System.out.println("caught IOException " + e);
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
            
            System.out.println("after: " + Ticket.countTickets());
        }
}

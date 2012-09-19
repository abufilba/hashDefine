package com.redcap.hashdefine.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

import flexjson.JSONDeserializer;

public class TicketTest {

    private Ticket ticket = new Ticket();

    @Test
    public void findTicketsByDescriptionLike() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void findTicketsByReferenceLike() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void findTicketsBySummaryLike() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void getDescription() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void setDescription() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void getSummary() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void setSummary() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void getReference() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void setReference() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void getLogMessages() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void setLogMessages() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void entityManager() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void countTickets() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void findAllTickets() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void findTicket() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void findTicketEntries() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void persist() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void remove() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void flush() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void clear() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void merge() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void getId() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void setId() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void getVersion() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void setVersion() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void toJson() {
        org.junit.Assert.assertTrue(true);
    }
    
    
    // Test case to bring information in from the hashDefine Extract to tickets
    @Test
    public void fromJsonToTicket() {
    	
    	Reader jsonTickets = getResourceAsReader("extract.json");
    	Ticket[] tickets = new JSONDeserializer<Ticket[]>().use("values.logMessages", HashSet.class).use("values.logMessages.values", new LogMessageObjectFactory()).deserialize( jsonTickets, Ticket[].class );
    	
        org.junit.Assert.assertNotNull(tickets);
        assertEquals(tickets[0].getSummary(),"WP3150-4 Drools Guvnor Investigations");
    }
    
    private Reader getResourceAsReader(String filename) {
    	StringBuffer buffer = new StringBuffer();
    	InputStream is = this.getClass().getClassLoader().getResourceAsStream(filename);
    	BufferedReader br = new BufferedReader(new InputStreamReader(is));
    	return br;          
    	
    }
    
    
    private String getResourceAsString(String filename) throws IOException {
    	StringBuffer buffer = new StringBuffer();
    	InputStream is = this.getClass().getClassLoader().getResourceAsStream(filename);
    	BufferedReader br = new BufferedReader(new InputStreamReader(is));
    	return br.readLine();          
    }

    @Test
    public void toJsonArray() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void fromJsonArrayToTickets() throws IOException {
    	String jsonTickets = getResourceAsString("extract.json");
    	Collection<Ticket> tickets = Ticket.fromJsonToArray(jsonTickets);
    	
        org.junit.Assert.assertNotNull(tickets);
        assertTrue(!tickets.isEmpty());
        Iterator<Ticket> iterator = tickets.iterator();
        Ticket ticket = iterator.next();
        assertEquals(ticket.getSummary(),"WP3150-4 Drools Guvnor Investigations");
        
    }

}

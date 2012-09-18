package com.redcap.hashdefine.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

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
    	Ticket ticket = new JSONDeserializer<Ticket>().deserialize( jsonTickets, Ticket.class );
    	
        org.junit.Assert.assertTrue(true);
    }
    
    private Reader getResourceAsReader(String filename) {
    	InputStream is = this.getClass().getClassLoader().getResourceAsStream(filename);
    	BufferedReader br = new BufferedReader(new InputStreamReader(is));
    	return br;
    }

    @Test
    public void toJsonArray() {
        org.junit.Assert.assertTrue(true);
    }

    @Test
    public void fromJsonArrayToTickets() {
        org.junit.Assert.assertTrue(true);
    }
}

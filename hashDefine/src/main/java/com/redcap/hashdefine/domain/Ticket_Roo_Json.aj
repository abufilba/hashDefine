// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.redcap.hashdefine.domain;

import com.redcap.hashdefine.domain.Ticket;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect Ticket_Roo_Json {
    
    public String Ticket.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Ticket Ticket.fromJsonToTicket(String json) {
        return new JSONDeserializer<Ticket>().use(null, Ticket.class).deserialize(json);
    }
    
    public static String Ticket.toJsonArray(Collection<Ticket> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Ticket> Ticket.fromJsonArrayToTickets(String json) {
        return new JSONDeserializer<List<Ticket>>().use(null, ArrayList.class).use("values", Ticket.class).deserialize(json);
    }
    
}

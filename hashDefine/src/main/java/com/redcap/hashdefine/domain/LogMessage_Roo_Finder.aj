// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.redcap.hashdefine.domain;

import com.redcap.hashdefine.domain.LogMessage;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect LogMessage_Roo_Finder {
    
    public static TypedQuery<LogMessage> LogMessage.findLogMessagesByMessageLike(String message) {
        if (message == null || message.length() == 0) throw new IllegalArgumentException("The message argument is required");
        EntityManager em = LogMessage.entityManager();
        TypedQuery<LogMessage> q = em.createQuery("SELECT o FROM LogMessage AS o WHERE LOWER(o.message) LIKE LOWER(:message)", LogMessage.class);
        q.setParameter("message", message);
        return q;
    }
    
}

package com.redcap.hashdefine.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJson(toJsonMethod="", fromJsonMethod="",fromJsonArrayMethod="fromJsonToArray")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findTicketsByDescriptionLike", "findTicketsByReferenceLike", "findTicketsBySummaryLike" })
public class Ticket {

    @NotNull
    private String description;

    @NotNull
    private String summary;

    @NotNull
    private String reference;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ticket")
    private Set<LogMessage> logMessages = new HashSet<LogMessage>();
    
}

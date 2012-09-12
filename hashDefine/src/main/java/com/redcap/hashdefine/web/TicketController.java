package com.redcap.hashdefine.web;

import com.redcap.hashdefine.domain.Ticket;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tickets")
@Controller
@RooWebScaffold(path = "tickets", formBackingObject = Ticket.class)
public class TicketController {
}

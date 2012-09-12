package com.redcap.hashdefine.web;

import com.redcap.hashdefine.domain.LogMessage;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/logmessages")
@Controller
@RooWebScaffold(path = "logmessages", formBackingObject = LogMessage.class)
public class LogMessageController {
}

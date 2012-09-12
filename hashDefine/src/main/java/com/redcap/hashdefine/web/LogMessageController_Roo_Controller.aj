// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.redcap.hashdefine.web;

import com.redcap.hashdefine.domain.LogMessage;
import com.redcap.hashdefine.domain.Ticket;
import com.redcap.hashdefine.web.LogMessageController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect LogMessageController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String LogMessageController.create(@Valid LogMessage logMessage, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, logMessage);
            return "logmessages/create";
        }
        uiModel.asMap().clear();
        logMessage.persist();
        return "redirect:/logmessages/" + encodeUrlPathSegment(logMessage.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String LogMessageController.createForm(Model uiModel) {
        populateEditForm(uiModel, new LogMessage());
        return "logmessages/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String LogMessageController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("logmessage", LogMessage.findLogMessage(id));
        uiModel.addAttribute("itemId", id);
        return "logmessages/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String LogMessageController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("logmessages", LogMessage.findLogMessageEntries(firstResult, sizeNo));
            float nrOfPages = (float) LogMessage.countLogMessages() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("logmessages", LogMessage.findAllLogMessages());
        }
        return "logmessages/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String LogMessageController.update(@Valid LogMessage logMessage, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, logMessage);
            return "logmessages/update";
        }
        uiModel.asMap().clear();
        logMessage.merge();
        return "redirect:/logmessages/" + encodeUrlPathSegment(logMessage.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String LogMessageController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, LogMessage.findLogMessage(id));
        return "logmessages/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String LogMessageController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        LogMessage logMessage = LogMessage.findLogMessage(id);
        logMessage.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/logmessages";
    }
    
    void LogMessageController.populateEditForm(Model uiModel, LogMessage logMessage) {
        uiModel.addAttribute("logMessage", logMessage);
        uiModel.addAttribute("tickets", Ticket.findAllTickets());
    }
    
    String LogMessageController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
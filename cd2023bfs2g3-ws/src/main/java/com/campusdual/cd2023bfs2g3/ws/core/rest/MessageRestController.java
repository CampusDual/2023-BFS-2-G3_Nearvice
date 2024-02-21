package com.campusdual.cd2023bfs2g3.ws.core.rest;

import com.campusdual.cd2023bfs2g3.api.core.service.IMessageService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageRestController extends ORestController<IMessageService> {

    @Autowired
    private IMessageService messageService;
    @Override
    public IMessageService getService(){
        return this.messageService;
    }
}

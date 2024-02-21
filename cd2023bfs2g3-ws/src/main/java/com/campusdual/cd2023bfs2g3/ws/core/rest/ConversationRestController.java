package com.campusdual.cd2023bfs2g3.ws.core.rest;

import com.campusdual.cd2023bfs2g3.api.core.service.IConversationService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversations")
public class ConversationRestController extends ORestController<IConversationService> {

    @Autowired
    private IConversationService conversationService;
    @Override
    public IConversationService getService(){
        return this.conversationService;
    }
}

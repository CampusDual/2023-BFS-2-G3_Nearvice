package com.campusdual.cd2023bfs2g3.ws.core.rest;

import com.campusdual.cd2023bfs2g3.api.core.service.IAnnounceService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/announces")
public class AnnounceRestController extends ORestController<IAnnounceService> {

    @Autowired
    private IAnnounceService announceService;
    @Override
    public IAnnounceService getService(){
        return this.announceService;
    }
}

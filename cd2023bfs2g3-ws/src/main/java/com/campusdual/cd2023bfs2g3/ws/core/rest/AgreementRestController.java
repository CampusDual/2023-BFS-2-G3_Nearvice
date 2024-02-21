package com.campusdual.cd2023bfs2g3.ws.core.rest;

import com.campusdual.cd2023bfs2g3.api.core.service.IAgreementService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agreements")
public class AgreementRestController extends ORestController<IAgreementService> {

    @Autowired
    private IAgreementService agreementService;
    @Override
    public IAgreementService getService(){
        return this.agreementService;
    }
}

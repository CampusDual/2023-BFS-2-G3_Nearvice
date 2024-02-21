package com.campusdual.cd2023bfs2g3.model.core.service;

import com.campusdual.cd2023bfs2g3.api.core.service.IServiceService;
import com.campusdual.cd2023bfs2g3.model.core.dao.ServiceDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("ServiceService")
public class ServiceService implements IServiceService {

    @Autowired
    private ServiceDao serviceDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;


    public EntityResult serviceQuery(Map<?, ?> keyMap, List<?> attrList) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(serviceDao, keyMap, attrList);
    }

    public EntityResult serviceInsert(Map<?, ?> attrMap) {
        return this.daoHelper.insert(serviceDao, attrMap);
    }

    public EntityResult serviceUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap) {
        return this.daoHelper.update(serviceDao, attrMap, keyMap);
    }

    public EntityResult serviceDelete(Map<?, ?> keyMap) {
        return this.daoHelper.delete(this.serviceDao, keyMap);
    }
}

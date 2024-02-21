package com.campusdual.cd2023bfs2g3.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;


@Lazy
@Repository(value = "ServiceDao")
@ConfigurationFile(configurationFile = "dao/ServiceDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ServiceDao extends OntimizeJdbcDaoSupport {

    public static final String S_ID = "S_ID";
    public static final String S_NAME = "S_NAME";

}

package com.campusdual.cd2023bfs2g3.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "UserDao")
@ConfigurationFile(
	configurationFile = "dao/UserDao.xml",
	configurationFilePlaceholder = "dao/placeholders.properties")
public class UserDao extends OntimizeJdbcDaoSupport {

    public static final String ID = "USER_";
    public static final String EMAIL = "EMAIL";
    public static final String PASSWORD = "PASSWORD";
    public static final String NAME = "NAME";
    public static final String SURNAME = "SURNAME";
    public static final String USERBLOCKED = "USERBLOCKED";
    public static final String LASTPASSWORDUPDATE = "LASTPASSWORDUPDATE";
    public static final String FIRSTLOGIN = "FIRSTLOGIN";
    public static final String LONGITUDE = "U_LONGITUDE";
    public static final String LATITUDE = "U_LATITUDE";

}

package com.campusdual.model.core.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.campusdual.api.core.service.IUserService;
import com.campusdual.model.core.dao.UserDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;


@Lazy
@Service("UserService")
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	public void loginQuery(Map<?, ?> key, List<?> attr) {
	}

	public EntityResult userQuery(Map<?, ?> keyMap, List<?> attrList) throws OntimizeJEERuntimeException {
		return this.daoHelper.query(userDao, keyMap, attrList);
	}
	public EntityResult userLocationQuery(List<?> attrList) throws OntimizeJEERuntimeException {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Map<String, Object> userKeyMap = new HashMap<>();
		userKeyMap.put("USER_",authentication.getName());
		return this.daoHelper.query(userDao, userKeyMap, attrList);
	}
	public EntityResult userAuthenticatedQuery(List<?> attrList) throws OntimizeJEERuntimeException {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Map<String, Object> userKeyMap = new HashMap<>();
		userKeyMap.put("USER_",authentication.getName());
		return this.daoHelper.query(userDao, userKeyMap, attrList);
	}

	public EntityResult userInsert(Map<?, ?> attrMap) {
		return this.daoHelper.insert(userDao, attrMap);
	}

	public EntityResult userUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap) {
		return this.daoHelper.update(userDao, attrMap, keyMap);
	}

	public EntityResult userDelete(Map<?, ?> keyMap) {
		return this.daoHelper.delete(this.userDao, keyMap);
	}

}

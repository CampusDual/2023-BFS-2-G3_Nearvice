package com.campusdual.cd2023bfs2g3.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface IAnnounceService {
    public EntityResult announceQuery(Map<?, ?> keyMap, List<?> attrList);
    public EntityResult announceAllQuery(Map<?, ?> keyMap, List<?> attrList);
    public EntityResult announceInsert(Map<?, ?> attrMap);
    public EntityResult announceUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap);
    public EntityResult announceDelete(Map<?, ?> keyMap);
}

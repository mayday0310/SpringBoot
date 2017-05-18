package com.mayday.ehcache;

import javassist.NotFoundException;

public interface EhcacheInfoService {

    void delete(Long id);

    EhcacheInfo update(EhcacheInfo updated) throws NotFoundException;

    EhcacheInfo findById(Long id);

    EhcacheInfo save(EhcacheInfo ehcacheInfo);

}
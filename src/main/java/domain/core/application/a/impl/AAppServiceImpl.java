package domain.core.application.a.impl;

import domain.core.application.a.AAppService;
import domain.core.application.a.model.ADto;
import domain.core.application.a.model.AModel;
import domain.core.application.a.query.Aquery;
import domain.infrastructure.redis.service.ARedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AAppServiceImpl implements AAppService {


    @Autowired
    private ARedisService aRedisService;


    @Override
    public AModel getA(Aquery aquery) {
        ADto a = aRedisService.getA(aquery);



        return null;
    }
}

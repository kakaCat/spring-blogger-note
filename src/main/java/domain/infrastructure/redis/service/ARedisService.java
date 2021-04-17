package domain.infrastructure.redis.service;

import domain.core.application.a.model.ADto;
import domain.core.application.a.query.Aquery;

public interface ARedisService {



    ADto getA(Aquery aquery);

}

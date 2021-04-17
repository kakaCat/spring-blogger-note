package domain.infrastructure.redis.service.impl;

import domain.core.application.a.model.ADto;
import domain.core.application.a.query.Aquery;
import domain.infrastructure.redis.service.ARedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class ARedisServiceImpl implements ARedisService {


    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public ADto getA(Aquery aquery) {
        redisTemplate.boundValueOps("StringKey").increment(3L);

        return new ADto();
    }
}

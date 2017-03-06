package com.angit.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Redis配置
 *
 * @author 
 */
@Configuration
public class RedisConfig {

	@Bean
	public RedisRepository redisRepository(StringRedisTemplate redisTemplate) {
		return new RedisRepository(redisTemplate);
	}
	
}
package ru.brobrocode.cadra.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.brobrocode.cadra.dto.UserInfoDTO;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@Configuration
public class CacheConfig {

	@Bean
	public LoadingCache<String, UserInfoDTO> userInfoCache() {
		return Caffeine.newBuilder()
				.expireAfterAccess(10, TimeUnit.MINUTES)
				.build(key -> new UserInfoDTO());
	}
}

package ru.brobrocode.cadra.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.dto.VacancyProcessingStateDTO;
import ru.brobrocode.cadra.entity.VacancyProcessingState;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {

	@Bean
	public LoadingCache<String, UserInfoDTO> userInfoCache() {
		return Caffeine.newBuilder()
				.expireAfterAccess(10, TimeUnit.MINUTES)
				.build(key -> new UserInfoDTO());
	}

	@Bean
	public Cache<String, VacancyProcessingStateDTO> vacancyProcessingStateCache() {
		return Caffeine.newBuilder()
				.expireAfterAccess(72, TimeUnit.HOURS)
				.build();
	}
}

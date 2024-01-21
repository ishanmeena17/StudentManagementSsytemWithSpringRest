package smswithspringrest.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sms_with_spring_rest").createEntityManager();
		
	}

}
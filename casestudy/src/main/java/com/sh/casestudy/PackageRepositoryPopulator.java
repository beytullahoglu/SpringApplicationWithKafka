package com.sh.casestudy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@Configuration
public class PackageRepositoryPopulator {

    @Bean
	public Jackson2RepositoryPopulatorFactoryBean getRespositoryPopulator() {
    	Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
    	factory.setResources(new Resource[]{new ClassPathResource("package-data.json")});
    	return factory;
	}
    
}

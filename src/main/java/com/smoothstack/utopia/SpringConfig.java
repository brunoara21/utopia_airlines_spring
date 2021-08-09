package com.smoothstack.utopia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smoothstack.utopia.dao.AuthorDao;

@Configuration
public class SpringConfig {

	//@Bean
	public AuthorDao getAuthorDao() {
		return new AuthorDao();
	}
}

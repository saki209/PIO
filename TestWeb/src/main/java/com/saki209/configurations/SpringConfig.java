package com.saki209.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.saki209.beans.Person;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.saki209")
public class SpringConfig {
<<<<<<< HEAD
	@Bean
	public Person getperson() {
		return new Person();
	}
=======
>>>>>>> 8d70f6abcfe282e00af0ed3cd7b1341ca501b503
	
	 @Bean
	    public ViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/pages/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }

}

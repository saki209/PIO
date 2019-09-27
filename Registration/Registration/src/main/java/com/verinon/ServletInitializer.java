package com.verinon;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


// This class will be generated automcatically when we select the web application as war file.

// This class will not be generated  when we select the web application as jar  file.

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RegistrationApplication.class);
	}

}

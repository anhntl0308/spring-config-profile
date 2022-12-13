package com.sovanm.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProfilesApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}
}































//	C2: edit configuration in IDE
//public static void main(String[] args) {
//	SpringApplication.run(ProfilesApplication.class, args);
//}

//	c3: run command line java -jar -Dspring.profiles.active=prod profiles-0.0.1-SNAPSHOT.jar


	// c2: use setAdditionalProfiles()
//	public static void main(String[] args) {
//		SpringApplication springApp = new SpringApplication(ProfilesApplication.class);
//		springApp.setAdditionalProfiles("dev", "prod");
//		springApp.run(args);
//	}
	//c3: use onStartUp SpringBootServletInitializer interface
//	public static void main(String[] args) {
//		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");
//		SpringApplication.run(ProfilesApplication.class, args);
//	}
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");
//		super.onStartup(servletContext);
//	}

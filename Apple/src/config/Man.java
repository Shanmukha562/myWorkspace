package config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class Man extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		
		new Man().configure(new SpringApplicationBuilder(Man.class)).run(args);
	}
 
	@Component
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig(){
			this.packages("api");
		}
	}
	
	
}


package config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Main extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		
		new Main().configure(new SpringApplicationBuilder(Main.class)).run(args);
	}
 
	@Component
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig(){
			this.packages("api");
		}
	}
	
	
}


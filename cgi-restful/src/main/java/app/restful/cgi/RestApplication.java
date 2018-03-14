package app.restful.cgi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"app.restful.cgi.controllers","app.restful.cgi.repositories",
	"app.restful.cgi.security","app.restful.cgi.services"})
@SpringBootApplication
public class RestApplication {

	  public static void main(String n[]){
		  SpringApplication.run(RestApplication.class,n);
	  }
}

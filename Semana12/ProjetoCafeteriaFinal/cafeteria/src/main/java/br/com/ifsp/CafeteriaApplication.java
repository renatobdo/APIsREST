package br.com.ifsp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://stackoverflow.com/questions/51221777/failed-to-configure-a-datasource-url-attribute-is-not-specified-and-no-embedd
//https://stackoverflow.com/questions/31134333/this-application-has-no-explicit-mapping-for-error
@SpringBootApplication
public class CafeteriaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CafeteriaApplication.class, args);
	}

}

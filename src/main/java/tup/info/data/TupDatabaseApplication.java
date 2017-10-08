package tup.info.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class TupDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TupDatabaseApplication.class, args);
	}
	

}

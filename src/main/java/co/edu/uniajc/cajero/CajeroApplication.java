package co.edu.uniajc.cajero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CajeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CajeroApplication.class, args);
		System.out.println("cajero is runnig");
	}

}
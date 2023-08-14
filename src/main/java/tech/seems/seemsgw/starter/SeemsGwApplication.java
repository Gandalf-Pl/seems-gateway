package tech.seems.seemsgw.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"tech.seems.seemsgw"})
public class SeemsGwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeemsGwApplication.class, args);
	}
}

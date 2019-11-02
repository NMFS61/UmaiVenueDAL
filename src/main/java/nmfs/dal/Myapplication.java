package nmfs.dal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main implementation class which serves two purpose in a spring boot application: Configuration and bootstrapping.
 * @author yatin-batra
 */
@SpringBootApplication
//@ComponentScan(basePackages = {
//        "nmfs,dal"
////		,
////        "guru.springframework.blog.componentscan.example.demopackageD",
////        "guru.springframework.blog.componentscan.example.demopackageE"
//    })
public class Myapplication {

	public static void main(String[] args) {
		SpringApplication.run(Myapplication.class, args);
	}
}
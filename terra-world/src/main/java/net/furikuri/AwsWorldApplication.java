package net.furikuri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class AwsWorldApplication {

    private int randomValue = new Random().nextInt(100);

    public static void main(String[] args) {
        SpringApplication.run(AwsWorldApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "World " + String.valueOf(randomValue);
    }
}

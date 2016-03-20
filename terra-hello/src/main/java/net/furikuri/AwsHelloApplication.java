package net.furikuri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class AwsHelloApplication {

    private RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        SpringApplication.run(AwsHelloApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        final String world = restTemplate.getForObject("http://world:8080/", String.class);
        return "Hello " + world;
    }
}

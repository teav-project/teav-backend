package jp.teav.teavbackend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Teav API", description = "This service matches people who want to develop teams with each other.", version = "v1"))
public class TeavBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeavBackendApplication.class, args);
    }

}

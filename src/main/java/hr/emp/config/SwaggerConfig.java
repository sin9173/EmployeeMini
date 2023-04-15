package hr.emp.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "Employee API",
                description = "API 명세",
                version = "v1"
        ))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

        @Bean
        public GroupedOpenApi api() {
                String[] paths = {"/**"};

                return GroupedOpenApi.builder()
                        .group("Employee API")
                        .pathsToMatch(paths)
                        .build();
        }
}

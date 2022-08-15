package nicolas2lee.tutorial.javaspringbootquickstart.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
  @Bean
  public GroupedOpenApi api() {
    return GroupedOpenApi.builder().group("quickstart-api").pathsToMatch("/**").build();
  }
}

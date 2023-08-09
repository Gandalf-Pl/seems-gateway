package tech.seems.seemsgw.router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonRouter {
    @Bean
    public RouteLocator myRouters(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("test", "seems"))
                        .uri("https://baidu.com")
                ).build();
    }
}

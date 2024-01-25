package com.example.gateway.configuration;

import lombok.AllArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ProxyConfig {
    private Filter filter;
//@Bean
//public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
//    return routeLocatorBuilder.routes()
//            .route("client-service", route -> route
//                    .path("/api/client/**")
//                    .filters(f -> f
//                            .rewritePath("/api/client/(?<remains>.*)", "/${remains}")
//                            .addResponseHeader("spring-cloud-course", "true")
//                            .addResponseHeader("X-HttpStatus", "403")
//                            .addResponseHeader("takesfsadas", "sakdlaskd")
//                            .removeRequestHeader("spring-cloud-course")
//                    )
//                    .uri("lb://client-service/")
//            )
//            .build();
//}
    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route("client-service",route -> route
                        .path("/api/client/***")
                        .filters(f -> f.filter(filter))
                        .uri("lb://client-service"))
                .build();
    }
}

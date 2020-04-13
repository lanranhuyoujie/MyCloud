package cn.hyf.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By 黄一飞 On 2020 04 12 15:18
 */
@Configuration
public class GatewayConfig
{
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder)
    {
        RouteLocatorBuilder.Builder routes = builder.routes();

        routes.route("path_route_hyf",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder)
    {
        RouteLocatorBuilder.Builder routes = builder.routes();

        routes.route("path_routh_hyf",r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();

        return routes.build();
    }
}

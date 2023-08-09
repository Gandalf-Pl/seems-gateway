package tech.seems.seemsgw.prefilter;

import org.springframework.boot.web.servlet.filter.OrderedFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class PerCustomFilter implements GlobalFilter, OrderedFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("pre filter ----------");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

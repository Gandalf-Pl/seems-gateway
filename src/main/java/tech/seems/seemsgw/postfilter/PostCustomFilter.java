package tech.seems.seemsgw.postfilter;

import org.springframework.boot.web.servlet.filter.OrderedFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class PostCustomFilter implements GlobalFilter, OrderedFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> System.out.println("post filter ---- "))
        );
    }

    @Override
    public int getOrder() {
        return 100;
    }
}

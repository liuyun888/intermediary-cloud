package cn.qmsk.intermediary.module.ins.life.framework.security.config;

import cn.qmsk.intermediary.framework.security.config.AuthorizeRequestsCustomizer;
import cn.qmsk.intermediary.module.ins.life.enums.ApiConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

@Configuration(proxyBeanMethods = false)
public class SecurityConfiguration {
    @Bean
    public AuthorizeRequestsCustomizer authorizeRequestsCustomizer() {
        return new AuthorizeRequestsCustomizer() {
            @Override
            public void customize(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
                registry.requestMatchers("/v3/api-docs/**", "/webjars/**", "/swagger-ui", "/swagger-ui/**",
                        "/druid/**", "/actuator", "/actuator/**").permitAll()
                        .requestMatchers(ApiConstants.PREFIX + "/**").permitAll();
            }
        };
    }
}

package me.goraj.mcshop.security;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Profile("dev")
@Configuration
@ConditionalOnProperty(
        value="spring.h2.console.enabled",
        havingValue = "true",
        matchIfMissing = false)
public class H2SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/h2_console/**").permitAll();
//        http.csrf().ignoringAntMatchers("/h2-console/**");
        http.csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }
}

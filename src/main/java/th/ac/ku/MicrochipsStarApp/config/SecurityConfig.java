//package th.ac.ku.MicrochipsStarApp.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/", "/css/**", "/js/**").permitAll()
//                .anyRequest().authenticated()
//
//                .and()
//                .oauth2Login()
//                .defaultSuccessUrl("/").permitAll()
//
//                .and()
//                .logout()
//                .logoutSuccessUrl("/").permitAll();
//
//        http.formLogin()
//                .defaultSuccessUrl("/message", true)
//                .and().logout();
//        http.formLogin()
//                .defaultSuccessUrl("/message", true)
//                .and().logout();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("usa")
//                .password(encoder().encode("usa"))
//                .roles("USER");
//    }
//
//    @Bean
//    public PasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//    }
//
//
//
//
//
//
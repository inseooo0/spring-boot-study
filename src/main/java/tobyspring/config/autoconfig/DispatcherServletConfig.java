package tobyspring.config.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import tobyspring.config.MyAutoConfiguration;

@MyAutoConfiguration // MyAutoConfiguration에 의해 설정되기 때문에 붙임(관례)
public class DispatcherServletConfig {

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet(); // spring container가 bean 생성 시에 applicationContext를 대신 주입해줌
    }
}

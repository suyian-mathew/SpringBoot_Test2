package com.qf.application;


import com.qf.application.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    /**
     * 测试一个很。。
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public FilterRegistrationBean getFilterBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setName("superFilter");
        bean.setFilter(new MyFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
}

package org.huangfugui.spring;

import org.huangfugui.spring.mvc.interceptor.SpringMVCInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.huangfugui.spring.mvc.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO Auto-generated method stub
        super.addResourceHandlers(registry);
    }*/

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration interceptorRegistration =  registry.addInterceptor(new SpringMVCInterceptor());
        //在所有handler操作前进行拦截检查，除了注册与登录操作
        interceptorRegistration.addPathPatterns("/basic/*");
        interceptorRegistration.excludePathPatterns("/basic/register");
        interceptorRegistration.excludePathPatterns("/basic/login");
    }

}

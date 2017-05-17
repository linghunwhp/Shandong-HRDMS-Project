package org.huangfugui.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"org.huangfugui.spring.service"})
@ImportResource({"classpath:spring-mapper.xml"})
public class MyConfig {

}

package com.fusion.config;

import java.util.Arrays;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.provider.MultipartProvider;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fusion.service.CustomerRestService;
import com.fusion.service.OrderRestService;
//import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {com.fusion.service.CustomerRestService.class, com.fusion.service.OrderRestService.class})
public class AppConfig {
	@Autowired private CustomerRestService customerRestService;
	@Autowired private OrderRestService orderRestService;
	@Bean(destroyMethod = "shutdown")
	public SpringBus cxf() {
		return new SpringBus();
	}

	@Bean(destroyMethod = "destroy") @DependsOn("cxf")
	public Server jaxRsServer() {
		final JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

		factory.setServiceBean(customerRestService);
		factory.setServiceBean(orderRestService);
		factory.setProvider(new JacksonJsonProvider());
		factory.setProvider(new ApiOriginFilter());
		factory.setProvider(new MultipartProvider());
		
		
		
		factory.setBus(cxf());
		factory.setAddress("/");


		factory.setFeatures(Arrays.asList(new Swagger2Feature()));
		return factory.create();
	}


	
	
	@Bean
	public ServletRegistrationBean cxfServlet() {
		final ServletRegistrationBean servletRegistrationBean = 
			new ServletRegistrationBean(new CXFServlet(), "/api/*");
		servletRegistrationBean.setLoadOnStartup(1);
		return servletRegistrationBean;
	}
}
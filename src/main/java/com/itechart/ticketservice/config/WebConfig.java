package com.itechart.ticketservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.itechart.ticketservice.service.postgre.UserDetailsServiceImpl;


@Configuration
@ComponentScan(basePackages = WebConfig.PACKAGE_CONTROLLERS, includeFilters = @Filter(Controller.class), useDefaultFilters = false)
public class WebConfig extends WebMvcConfigurationSupport {
	public static final String PACKAGE_CONTROLLERS = "com.itechart.ticketservice.controller";

	private static final String VIEWS = "/WEB-INF/";
	private static final String RESOURCE_HANDLER = "/resources/";
	private static final String RESOURCE_LOCATION = RESOURCE_HANDLER + "**";

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix(WebConfig.VIEWS);
		viewResolver.setSuffix(".html");
		viewResolver.setCache(false);
		return viewResolver;
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(WebConfig.RESOURCE_HANDLER)
				.addResourceLocations(WebConfig.RESOURCE_LOCATION);

		super.addResourceHandlers(registry);
	}

	@Override
	protected void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	public UserDetailsService getUserDetailsService(){
	    return new UserDetailsServiceImpl();
	}
}
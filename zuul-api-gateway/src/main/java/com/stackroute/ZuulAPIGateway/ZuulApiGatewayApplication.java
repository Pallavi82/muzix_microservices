package com.stackroute.ZuulAPIGateway;

import com.stackroute.ZuulAPIGateway.filters.ErrorFilter;
import com.stackroute.ZuulAPIGateway.filters.PostFilter;
import com.stackroute.ZuulAPIGateway.filters.PreFilter;
import com.stackroute.ZuulAPIGateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApiGatewayApplication {

	public static void main(String[] args){

		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
		@Bean
		public PreFilter preFilter() {
			return new PreFilter();
		}
		@Bean
		public PostFilter postFilter() {
			return new PostFilter();
		}
		@Bean
		public ErrorFilter errorFilter() {
			return new ErrorFilter();
		}
		@Bean
		public RouteFilter routeFilter() {
			return new RouteFilter();
		}
}


package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableEurekaClient  //开启客户端
@EnableRedisHttpSession
public class SpringclouduserApplication {
	/*@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> containerCustomizer() {
		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
			@Override
			public void customize(ConfigurableWebServerFactory container) {
				int port = SocketUtils.findAvailableTcpPort(8001, 8999);// 随机端口号范围
				container.setPort(port);
				System.getProperties().put("server.port", port);
			}
		};
	}*/


	public static void main(String[] args) {
		SpringApplication.run(SpringclouduserApplication.class, args);
	}

}

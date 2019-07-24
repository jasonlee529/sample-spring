package cn.lee.jason.springcloudeurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringCloudEurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurakeApplication.class, args);
    }
}

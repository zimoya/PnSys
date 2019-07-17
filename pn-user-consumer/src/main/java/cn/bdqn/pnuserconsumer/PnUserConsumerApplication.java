package cn.bdqn.pnuserconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PnUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PnUserConsumerApplication.class, args);
    }

}

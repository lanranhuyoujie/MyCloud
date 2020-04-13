package cn.hyf.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created By 黄一飞 On 2020 04 09 16:53
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}

package cn.hyf.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created By 黄一飞 On 2020 04 10 18:32
 */
public interface LoadBalancer
{
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}

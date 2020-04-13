package cn.hyf.springcloud.service;

        import cn.hyf.springcloud.entities.CommonResult;
        import cn.hyf.springcloud.entities.Payment;
        import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.stereotype.Component;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created By 黄一飞 On 2020 04 11 9:25
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService
{
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment);

}

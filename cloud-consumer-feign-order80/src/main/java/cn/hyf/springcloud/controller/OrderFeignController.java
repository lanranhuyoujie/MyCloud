package cn.hyf.springcloud.controller;

import cn.hyf.springcloud.entities.CommonResult;
import cn.hyf.springcloud.entities.Payment;
import cn.hyf.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created By 黄一飞 On 2020 04 11 9:39
 */
@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment)
    {
        return paymentFeignService.create(payment);
    }
}

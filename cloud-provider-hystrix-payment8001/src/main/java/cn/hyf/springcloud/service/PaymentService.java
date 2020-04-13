package cn.hyf.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created By 黄一飞 On 2020 04 11 10:36
 */
@Service
public interface PaymentService
{
    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);

    public String paymentInfo_TimeOutHandler(Integer id);

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);
}

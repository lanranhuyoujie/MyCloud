package cn.hyf.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created By 黄一飞 On 2020 04 12 11:05
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "------PaymentFallbackService fall back-paymentInfo_OK,0(TT__TT)0";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "------PaymentFallbackService fall back-paymentInfo_TimeOut,0(TT__TT)0";
    }
}

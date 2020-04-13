package cn.hyf.springcloud.service.impl;

import cn.hyf.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created By 黄一飞 On 2020 04 11 11:55
 */
@Service
public class PaymentHystrixServiceImpl implements PaymentHystrixService
{
    public String paymentInfo_OK(Integer id)
    {
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_OK,id："+id+"\t"+"0(n_n)O哈哈~";
    }

    public String paymentInfo_TimeOut(Integer id)
    {
        int timeNumber = 5;
        try { TimeUnit.SECONDS.sleep(timeNumber);}catch(InterruptedException e){e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeOut,id："+id+"\t"+"0(n_n)O哈哈~"+" 耗时（秒）："+timeNumber;
    }
}

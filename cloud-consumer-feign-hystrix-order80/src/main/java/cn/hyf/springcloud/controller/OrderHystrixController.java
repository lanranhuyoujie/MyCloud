package cn.hyf.springcloud.controller;

import cn.hyf.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created By 黄一飞 On 2020 04 11 11:58
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallBackMethod")
public class OrderHystrixController
{
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id)
    {
        String result = paymentHystrixService.paymentInfo_OK(id);
        log.info("****result: "+result);
        return result;
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallBackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id)
    {
        int timeNumber = 2;
        try { TimeUnit.SECONDS.sleep(timeNumber);}catch(InterruptedException e){e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeOut,id："+id+"\t"+"0(n_n)O哈哈~"+" 耗时（秒）："+timeNumber;
    }

    public String paymentTimeOutFallBackMethod(Integer id)
    {
        return " 我是消费者80，对方支付系统繁忙，请稍后再试,或者运行出错请检查"+"0(TT__TT)O";
    }

    public String payment_Global_FallBackMethod()
    {
        return "Global异常处理信息，请稍后再试，/（ToT）/";
    }
}

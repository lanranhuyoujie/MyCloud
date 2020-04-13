package cn.hyf.springcloud.service.impl;

import cn.hyf.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created By 黄一飞 On 2020 04 13 14:09
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider
{
    @Resource
    private MessageChannel output;

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("****serial: "+serial);
        return null;
    }
}

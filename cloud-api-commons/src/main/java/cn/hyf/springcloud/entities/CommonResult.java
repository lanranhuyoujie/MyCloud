package cn.hyf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By 黄一飞 On 2020 04 09 14:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message)
    {
        this(code,message,null);
    }
}

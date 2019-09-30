package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;

/**
 * @Author: 11101453
 * @Date: 2019/9/24
 * @Description: 服务提供方实现接口
 */
public class DemoServiceImpl implements DemoService {
    
    public String sayHello(String name){
        return "Hello " + name;
    }
    
}

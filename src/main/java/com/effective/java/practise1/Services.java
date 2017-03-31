package com.effective.java.practise1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Bright on 2017/3/31.
 * 服务提供者框架 --  服务提供者注册API  Provider registration API 服务访问API  Service access API
 * 静态工厂模式
 */
public class Services {
    private Services() {}    // Prevents instatiation

    private static Map<String,Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public void registerDefaultProvider(Provider provider){
        providers.put(DEFAULT_PROVIDER_NAME,provider);
    }

    public void registerProvider(String name,Provider provider){
        providers.put(name,provider);
    }

    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name){
        Provider provider = providers.get(name);

        if(provider == null){
            throw new IllegalArgumentException("No provider registered with name"+name);
        }

        return provider.newService();
    }
}

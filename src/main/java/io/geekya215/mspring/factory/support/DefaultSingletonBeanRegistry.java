package io.geekya215.mspring.factory.support;

import io.geekya215.mspring.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void registerSingleton(String beanName, Object singletonBean) {
        singletonObjects.put(beanName, singletonBean);
    }
}

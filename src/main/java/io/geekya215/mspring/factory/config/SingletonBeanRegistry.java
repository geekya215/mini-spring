package io.geekya215.mspring.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}

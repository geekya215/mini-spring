package io.geekya215.mspring.factory.support;

import io.geekya215.mspring.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

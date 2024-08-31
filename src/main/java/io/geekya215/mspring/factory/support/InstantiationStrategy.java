package io.geekya215.mspring.factory.support;

import io.geekya215.mspring.BeansException;
import io.geekya215.mspring.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> ctor, Object[] args) throws BeansException;
}

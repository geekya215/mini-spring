package io.geekya215.mspring.factory;

import io.geekya215.mspring.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}

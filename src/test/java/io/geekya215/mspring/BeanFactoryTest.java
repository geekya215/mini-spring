package io.geekya215.mspring;


import io.geekya215.mspring.factory.BeanFactory;
import io.geekya215.mspring.factory.config.BeanDefinition;
import io.geekya215.mspring.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class BeanFactoryTest {
    @Test
    public void testBeanFactory() throws BeansException {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService singletonUserService = (UserService) beanFactory.getBean("userService");
        singletonUserService.queryUserInfo();
    }
}

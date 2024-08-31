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

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "neko");
        userService.queryUserInfo();
    }
}

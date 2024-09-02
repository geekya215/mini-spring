package io.geekya215.mspring;


import io.geekya215.mspring.factory.BeanFactory;
import io.geekya215.mspring.factory.config.BeanDefinition;
import io.geekya215.mspring.factory.config.BeanReference;
import io.geekya215.mspring.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class BeanFactoryTest {
    @Test
    public void testBeanFactory() throws BeansException {
        // 1.initial BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. register UserDao
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. set UserService properties
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("id", "1"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. register UserService
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. get UserService
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}

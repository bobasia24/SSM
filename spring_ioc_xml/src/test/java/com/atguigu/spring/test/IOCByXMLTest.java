package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {
    @Test
    public void testIOC(){
        /**
         * 获取bean的三种方式：
         * 1、根据bean的id获取
         * 2、根据bean的类型获取
         * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
         * 若没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
         * 若有多个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
         * 3、根据bean的id和类型获取
         * 结论：
         * 根据类型来获取bean时，在满足bean唯一性的前提下
         * 其实只是看：『对象 instanceof 指定的类型』的返回结果
         * 只要返回的是true就可以认定为和类型匹配，能够获取到。
         * 即通过bean的类型、bean所继承的类的类型、bean所实现的接口的类型都可以获取bean
         */


        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        Student bean = ioc.getBean(Student.class);
//        Student studentTwo = (Student) ioc.getBean("studentTwo");
        Student bean = ioc.getBean("studentOne", Student.class);
        System.out.println(bean);

    }

    @Test
//    测试依赖注入，为属性赋值
    public void testDI(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student bean = ioc.getBean("studentTwo", Student.class);
        System.out.println(bean);
    }

    @Test
//    测试依赖注入，为构造器赋值
    public void testConstuct(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student bean = ioc.getBean("studentThree", Student.class);
        System.out.println(bean);
    }

    @Test
//    测试依赖注入，赋值NULL值
    public void testNull(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student bean = ioc.getBean("studentFour", Student.class);
        System.out.println(bean);
    }

    @Test
//    测试依赖注入，为数组及class类赋值
    public void testClazzAndArray(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student bean = ioc.getBean("studentFive", Student.class);
        System.out.println(bean);
    }
}

package com.myproject.BeanFactory_Example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource resource = new ClassPathResource("Bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        
        Student student = (Student)factory.getBean("student");
        student.displayName();
    }
}

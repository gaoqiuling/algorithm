package com.itisacat.algo.sourceCode.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.annotation.Nullable;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

@Configuration
public class SpringLifeCycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringLifeCycle.class);
        context.registerBeanDefinition("demoBean", new RootBeanDefinition(DemoBean.class));
        context.getBean("demoBean");

        context.registerBeanDefinition("demoBean2", new RootBeanDefinition(DemoBean2.class));
        context.getBean("demoBean2");
        context.start();
        context.destroy();
    }

    public static class DemoBean {

    }

    public static class DemoBean2 {

    }


    @Bean
    public BeanPostProcessor fullyBeanPostProcessor() {
        return new FullyBeanPostProcessor();
    }

    @Order
    public class FullyBeanPostProcessor implements BeanPostProcessor,
            InstantiationAwareBeanPostProcessor,
            SmartInstantiationAwareBeanPostProcessor,
            MergedBeanDefinitionPostProcessor,
            DestructionAwareBeanPostProcessor {
        @Nullable
        @Override
        public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
            System.out.println("1>>>>InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
            return null;
        }

        @Nullable
        @Override
        public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
            System.out.println("2>>>>SmartInstantiationAwareBeanPostProcessor.determineCandidateConstructors");
            return null;
        }

        @Override
        public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
            System.out.println("3>>>>MergedBeanDefinitionPostProcessor.postProcessMergedBeanDefinition");
        }

        @Override
        public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
            System.out.println("4>>>>InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
            return false;
        }

        @Nullable
        @Override
        public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
            System.out.println("5>>>>InstantiationAwareBeanPostProcessor.postProcessPropertyValues");
            return null;
        }

        @Nullable
        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("6>>>>BeanPostProcessor.postProcessBeforeInitialization");
            return null;
        }

        @Nullable
        @Override
        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("7>>>>BeanPostProcessor.postProcessAfterInitialization");
            return null;
        }

        @Override
        public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
            System.out.println("8>>>>DestructionAwareBeanPostProcessor.postProcessBeforeDestruction");
        }
    }
}
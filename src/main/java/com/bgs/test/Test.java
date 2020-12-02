package com.bgs.test;

import com.bgs.bean.Person;
import com.bgs.config.Springconfig;
import com.bgs.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Springconfig.class);
        // 在Spring容器中获取Bean对象
        PersonService bean = context.getBean(PersonService.class);
        //调用对象中的方法
        List<Person> people = bean.quertPersonList();
        for (Person person:people ) {
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getAddress());
        }
        context.destroy();

    }
}

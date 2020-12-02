package com.bgs.config;

import com.bgs.bean.Person;
import com.bgs.dao.PersonDao;
import com.bgs.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Springconfig {
    //@Bean用于向容器中放入对象，如果在UserDao类前面打上@Repository注解就不用@Bean方式
    // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    @Bean
    public PersonService personService(){
        return new PersonService();
    }
    @Bean
    public PersonDao PersonDao(){
        return new PersonDao();
    }

}

package com.bgs.dao;

import com.bgs.bean.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao{
    public List<Person> queryPersonList(){
        List<Person> list = new ArrayList<Person>();
        //模拟数据库的查询
        for ( int i = 0 ;i < 10;i++){
            Person person = new Person();
            person.setName("name" + i );
            person.setAge(1 + i );
            person.setAddress("address" + i );
            list.add(person);
        }
        return list;
    }
}

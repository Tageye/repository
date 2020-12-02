package com.bgs.service;

import com.bgs.bean.Person;
import com.bgs.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;
    public List<Person> quertPersonList(){
        // 调用personDAO中的方法进行查询
        return this.personDao.queryPersonList();
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}

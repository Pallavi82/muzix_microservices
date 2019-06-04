package com.stackroute.repository;


import com.stackroute.domain.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    private User user;

    @Before
    public void setUp()
    {
        user = new User();
        user.setAge(10);
        user.setFirstName("Hermione");
        user.setId(2);
        user.setLastName("Granger");

    }

    @After
    public void tearDown(){

        userRepository.deleteAll();
    }


    @Test
    public void testSaveUser(){
     userRepository.save(user);
     User fetchUser = userRepository.findById(user.getId()).get();
        Assert.assertEquals(2,fetchUser.getId());

    }

    @Test
    public void testSaveUserFailure(){
        User testUser = new User("Ron","Weasley",10,"Ron26",3);
        userRepository.save(user);
        User fetchUser = userRepository.findById(user.getId()).get();
        Assert.assertNotSame(testUser,user);
    }

    @Test
    public void testGetAllUser(){
        User u = new User("Severus","Snape",32,"Snape8",4);
        User u1 = new User("Sirius","Black",34,"Sirius10",5);
        userRepository.save(u);
        userRepository.save(u1);

        List<User> list = userRepository.findAll();
        Assert.assertEquals("Hermione",list.get(0).getFirstName());




    }


}

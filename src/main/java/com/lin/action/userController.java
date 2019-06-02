package com.lin.action;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class userController {
    @RequestMapping("{id}")
    @ResponseBody
    public User userInfo(@PathVariable Integer id){

        User u= new User("hh","eee");
        u.setId(id);
        return u;
    }
}

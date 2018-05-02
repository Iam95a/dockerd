package com.chen.docckerd;

import com.chen.docckerd.entity.User;
import com.chen.docckerd.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenjinwei
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private UserRepository userRepository;
    @RequestMapping("hello")
    public String hello() {
        return "hello nihao ";
    }

    @GetMapping("/user")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/getUserById")
    public User getUserById(@RequestParam(name = "id")Integer id){
        return userRepository.findById(id);
    }

    @GetMapping("/getPageUser")
    public Page<User> getPageUser(){
        return userRepository.findAll(new PageRequest(1,20));
    }
}

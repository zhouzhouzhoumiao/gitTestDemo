package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public List<User> findAll(){
      List<User> list= userService.findAll();
      return list;
    }
}

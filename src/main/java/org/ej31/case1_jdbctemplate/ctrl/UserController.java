package org.ej31.case1_jdbctemplate.ctrl;

import org.ej31.case1_jdbctemplate.model.User;
import org.ej31.case1_jdbctemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public void addUser(@RequestParam String userName) {
        userService.addUser(userName);
    }

}
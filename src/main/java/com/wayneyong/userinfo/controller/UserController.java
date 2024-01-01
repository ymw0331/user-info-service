package com.wayneyong.userinfo.controller;


import com.wayneyong.userinfo.dto.UserDTO;
import com.wayneyong.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        UserDTO savedUser = userService.addUser(userDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // fetch all order details
    @GetMapping("/fetchUserById/{userId}")
    ResponseEntity<UserDTO> fetchUserDetailsById(@PathVariable Integer userId) {
        return userService.fetchUserDetailsById(userId);

    }

}

package smartdev.com.spring_boot_user_api.api.controller;

import org.springframework.stereotype.Repository;
import smartdev.com.spring_boot_user_api.api.exception.ResourceNotFoundException;
import smartdev.com.spring_boot_user_api.api.model.User;
import smartdev.com.spring_boot_user_api.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}

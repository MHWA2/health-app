package healthcare.healthcare_spring.controller;

import healthcare.healthcare_spring.dto.request.UserRequest;
import healthcare.healthcare_spring.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserRequest request) {userService.saveUser(request);}
}

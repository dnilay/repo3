package com.example.photoappapiuser.ui;

import com.example.photoappapiuser.dto.UserDto;
import com.example.photoappapiuser.model.UserEntity;
import com.example.photoappapiuser.service.UserService;
import com.example.photoappapiuser.shared.UserRequestModelEntity;
import com.example.photoappapiuser.shared.UserResponseModelEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRestController {
    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/users")
    public ResponseEntity<UserResponseModelEntity> createUser(@RequestBody UserRequestModelEntity userDetails)
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDto=mapper.map(userDetails,UserDto.class);
        userService.createUser(userDto);
        UserResponseModelEntity userResponseModelEntity=mapper.map(userDto,UserResponseModelEntity.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseModelEntity);
    }
    @GetMapping("/users/{userId}")
    public  ResponseEntity<UserResponseModelEntity> findUserByUserId(@PathVariable("userId") String userId) throws UserNotFoundException {
        UserEntity userEntity=userService.findByUserId(userId);
        if(userEntity==null)
        {
            throw new UserNotFoundException("user not found with the user id: "+userId);
        }
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return ResponseEntity.status(HttpStatus.FOUND).body(mapper.map(userEntity,UserResponseModelEntity.class));
    }
}

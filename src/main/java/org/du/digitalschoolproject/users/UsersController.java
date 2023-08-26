package org.du.digitalschoolproject.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class UsersController {

    private UsersService usersService;
    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping(path = "/users")
    public List<UserEntity> findAll(){

        List<UserEntity> userEntities = usersService.findAll();
        return userEntities;
    }

    @GetMapping(path = "/users/{id}")
    public UserEntity findById(@PathVariable Long id){

        return usersService.findById(id).orElse(null);
    }

    @GetMapping(path = "/users", params = "name")
    public Set<UserEntity> findByName(@RequestParam String name){

        return usersService.findByName(name);
    }

    @PostMapping(path = "/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity save(@RequestBody UserEntity userEntity){

        return usersService.save(userEntity);
    }
}

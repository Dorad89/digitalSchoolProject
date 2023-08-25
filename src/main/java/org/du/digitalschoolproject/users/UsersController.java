package org.du.digitalschoolproject.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class UsersController {

    private UsersRepository usersRepository;
    @Autowired
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @GetMapping(path = "/users")
    public List<UserEntity> findAll(){

        List<UserEntity> userEntities = usersRepository.findAll();
        return userEntities;
    }

    @GetMapping(path = "/users/{id}")
    public UserEntity findById(@PathVariable Long id){

        return usersRepository.findById(id).orElse(null);
    }

    @GetMapping(path = "/users", params = "name")
    public Set<UserEntity> findByName(@RequestParam String name){

        return usersRepository.findByFirstNameIgnoreCase(name);
    }

    @PostMapping(path = "/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity save(@RequestBody UserEntity userEntity){

        return usersRepository.save(userEntity);
    }
}

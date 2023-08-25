package org.du.digitalschoolproject.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

        return usersRepository.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public UserEntity findById(@PathVariable Long id){

        return usersRepository.findById(id).orElse(null);
    }

    @GetMapping(path = "/users", params = "name")
    public Set<UserEntity> findByName(@RequestParam String name){

        return usersRepository.findByFirstNameIgnoreCase(name);
    }
}

package org.du.digitalschoolproject.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    private UsersRepository usersRepository;
    @Autowired
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
/*    @GetMapping(path = "/users")
    public List<UserEntity> findAll(){
        return usersRepository.findAll();
    }*/
}

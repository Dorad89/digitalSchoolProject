package org.du.digitalschoolproject.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UsersServiceImpl implements UsersService{

    private UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<UserEntity> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    public Set<UserEntity> findByName(String name) {
        return usersRepository.findByFirstNameIgnoreCase(name);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return usersRepository.save(userEntity);
    }
}
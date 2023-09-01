package org.du.digitalschoolproject.users;

import org.du.digitalschoolproject.users.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
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

        userEntity.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        userEntity.setCreatedBy(1L); //to be corrected

        return usersRepository.save(userEntity);
    }

    @Override
    public void deleteById(Long id) {

        Optional<UserEntity> userEntityOptional = usersRepository.findById(id);

        if (userEntityOptional.isPresent()){

        //    usersRepository.deleteById(id);
         UserEntity userEntity = userEntityOptional.get();
         userEntity.setDeletedAt(new Timestamp(System.currentTimeMillis()));
         userEntity.setDeletedBy(1L); //to be corrected

         usersRepository.save(userEntity);

        }else throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                                "User with id " + id + " not found!");
    }
}

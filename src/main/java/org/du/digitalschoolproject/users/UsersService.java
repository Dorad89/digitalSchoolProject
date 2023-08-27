package org.du.digitalschoolproject.users;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UsersService {

    List<UserEntity> findAll();
    Optional<UserEntity> findById(Long id);
    Set<UserEntity>findByName(String name);
    UserEntity save(UserEntity userEntity);

    void deleteById(Long id);
}

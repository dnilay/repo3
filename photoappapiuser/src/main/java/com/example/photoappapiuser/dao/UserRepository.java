package com.example.photoappapiuser.dao;

import com.example.photoappapiuser.model.UserEntity;
import com.example.photoappapiuser.shared.UserResponseModelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer> {
    public UserEntity findByUserId(String userId);
    public UserEntity findByEmail(String email);


}

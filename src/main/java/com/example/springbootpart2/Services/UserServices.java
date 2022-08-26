package com.example.springbootpart2.Services;

import com.example.springbootpart2.dto.UserDto;
import com.example.springbootpart2.mapper.UserMapper;
import com.example.springbootpart2.model.Users;
import com.example.springbootpart2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class UserServices implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper userMapper;

    public UserDto save(UserDto userDto){
        return userMapper.toDto(repository.save(userMapper.toEntity(userDto)));
    }


    public void deleteById(int id){
        repository.deleteById(id);

    }


    public List<UserDto> findAll(){
        List<Users> usersList = repository.findAll();
        List<UserDto> userDtoList = userMapper.toDto(usersList);
        return userDtoList;
    }

    public UserDto findById(int id){
        Users users = new Users();
        users = repository.findById(id).get();

        return users != null ? userMapper.toDto(users) : null;
    }

    public UserDto update(UserDto userDto){
        return userMapper.toDto(repository.save(userMapper.toEntity(userDto)));
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = new Users();
        users = repository.findByUsername(username);
        if (users == null){
            throw new UsernameNotFoundException("Bad Credentials");
        }
        return users;
    }
}

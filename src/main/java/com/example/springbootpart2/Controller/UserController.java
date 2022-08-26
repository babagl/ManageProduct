package com.example.springbootpart2.Controller;

import com.example.springbootpart2.Services.UserServices;
import com.example.springbootpart2.dto.UserDto;
import com.example.springbootpart2.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserServices services = new UserServices();
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity<UserDto> save (@RequestBody UserDto userDto){
        return new ResponseEntity<>(services.save(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(services.findById(id));
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam("username") String username,@RequestParam String password){

        authenticate(username,password);
        UserDetails userDetails= services.loadUserByUsername(username);
        Users users = (Users) userDetails;
        String message;
        return ResponseEntity.ok("Succesfully connected");
    }

    private void authenticate(String username, String password){
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username,password)
            );
        }catch (BadCredentialsException e){
            throw new BadCredentialsException("invalid username or password");
        }catch (DisabledException e){
            throw new DisabledException("an error has occur");
        }
    }







}

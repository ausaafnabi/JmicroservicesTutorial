package com.example.demo.user;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
    
    @Autowired
    private UserDaoService service;
	//private URI uri;
    
    //GET '/users'
    @GetMapping(path="/users")
    public List<User> retrieveAllUser(){
       return service.findAll(); 
    }

    //GET '/users/<id>'
    @GetMapping(path="/users/{id}")
    public User retrieveUser(@PathVariable Integer id){
        User user =  service.findOne(id);
        
        if(user==null){
            throw new UserNotFoundExecption("id-" + id);
        }
        return user;
    }

    //POST '/users'
    @PostMapping(path="/users")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = service.save(user);
        
        URI location  =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path="/users/{id}")
    public void DeleteUser(@PathVariable Integer id){
        User user =  service.deleteUserByIDUser(id);
        
        if(user==null){
            throw new UserNotFoundExecption("id-" + id);
        }
    }
}

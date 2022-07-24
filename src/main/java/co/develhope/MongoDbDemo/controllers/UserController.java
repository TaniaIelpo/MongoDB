package co.develhope.MongoDbDemo.controllers;


import co.develhope.MongoDbDemo.entities.User;
import co.develhope.MongoDbDemo.repositories.UserRepository;
import co.develhope.MongoDbDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Tania Ielpo
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){

        return userService.save(user);
    }

    @GetMapping
    public List<User> getUsers (){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id) throws Exception {
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable String id,
                                 @RequestBody User user) throws Exception {
        return userService.update(id, user);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        userService.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        userService.deleteAll();
    }


}

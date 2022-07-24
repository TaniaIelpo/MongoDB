package co.develhope.MongoDbDemo.services;


import co.develhope.MongoDbDemo.entities.User;
import co.develhope.MongoDbDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Tania Ielpo
 */

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User update(String id, User user) throws Exception {
        if(!userRepository.existsById(id)) throw new Exception ("User not found");
        user.setId(id);
        return userRepository.save(user);
    }

    public User save(User user) {
        user.setId(null);
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(String id) throws Exception {
        if(!userRepository.existsById(id)) throw new Exception ("User not found");
        return userRepository.findById(id);
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }
}

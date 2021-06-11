package br.com.sensedia.service;

import br.com.sensedia.model.User;
import br.com.sensedia.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserByUsername(String username){
        Optional<User> userOptional = userRepository.findByUsername(username);
        if(userOptional.isPresent()) return userOptional.get();
        return null;
    }

    public User saveUser(User user){
        Optional<User> userOptional = userRepository.findByUsername(user.getUsername());
        if(userOptional.isPresent()) return null;
        User userSaved = userRepository.save(user);
        return userSaved;
    }

    public boolean deleteByID(String id){
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isPresent()){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }
}

package com.squareGames.stats.DAO;

import com.squareGames.stats.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Component
public class UserDao {
//    @Autowired
    UserRepository userRepository;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Autowired
//    public void setUserRepository(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

//    public UserDao() {
//
//    }

    public void saveUser(User user){
        Random random = new Random();
        var nbLoses = 40 + random.nextInt(230 - 40);
        user.setNbLoses((int)nbLoses);
        var nbWins = 40 + random.nextInt(230 - 40);
        user.setNbWins((int)nbWins);
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findOne(Integer id){
        return userRepository.getOneById(id);
    }


}

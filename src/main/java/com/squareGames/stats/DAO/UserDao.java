package com.squareGames.stats.DAO;

public class UserDao {
    UserRepository userRepository;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}

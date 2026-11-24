package com.codeguard.testdata;

import java.util.List;
import java.util.Optional;

public class Dataset1_CleanCode {

    private final UserRepository userRepository;

    public Dataset1_CleanCode(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getDatabasePassword() {
        return System.getenv("DB_PASSWORD");
    }

    public Optional<User> findUser(String userId) {
        if (userId == null || userId.isBlank()) {
            return Optional.empty();
        }
        return userRepository.findById(userId);
    }

    public String joinNames(List<String> names) {
        StringBuilder builder = new StringBuilder();
        for (String name : names) {
            builder.append(name).append(", ");
        }
        return builder.toString();
    }

    interface UserRepository {
        Optional<User> findById(String id);
    }

    record User(String id, String name) {
    }
}

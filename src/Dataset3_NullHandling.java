package com.codeguard.testdata;

import java.util.HashMap;
import java.util.Map;

public class Dataset3_NullHandling {

    private final Map<String, String> users = new HashMap<>();

    public String findUserName(String userId) {
        if (!users.containsKey(userId)) {
            return null;
        }
        return users.get(userId);
    }

    public int getNameLength(String userId) {
        String name = findUserName(userId);
        return name.trim().length();
    }
}

package com.tms.repository;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, String> userList;

    {
        userList = new HashMap<>();
        userList.put("admin", "admin");
        userList.put("user", "user");
    }

    public boolean isUserContains(String username) {
        return userList.containsKey(username);
    }

    public String getPassword(String username) {
        return userList.get(username);
    }
}

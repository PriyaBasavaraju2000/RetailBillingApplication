package com.example.retailBilling.service;


import com.example.retailBilling.io.UserRequest;
import com.example.retailBilling.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}


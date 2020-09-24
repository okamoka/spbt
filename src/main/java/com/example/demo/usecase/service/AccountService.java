package com.example.demo.usecase.service;

import java.util.List;

import com.example.demo.domain.users.User;

public interface AccountService {
  List<User> findAll();

  void register(String name, String email, String password, String[] roles);
}

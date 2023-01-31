package com.ln.service;

import com.ln.pojo.UserView;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface UserService {
   UserView loginUser(UserView userView);
   List<UserView> findAll();
   void delUserById(int id);
   void addUser(UserView userView);
   UserView findUserById(Integer id);
   void updateUserById(UserView userView);
   List<UserView> findAll_page(Map map);
}

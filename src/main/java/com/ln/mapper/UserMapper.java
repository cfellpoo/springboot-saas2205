package com.ln.mapper;

import com.ln.pojo.UserView;

import java.util.List;

public interface UserMapper {
   UserView loginUser(UserView userView);
   List<UserView> findAll();

   void delUserById(int id);
   void addUser(UserView userView);

   UserView findUserById(Integer id);
   void updateUserById(UserView userView);
}

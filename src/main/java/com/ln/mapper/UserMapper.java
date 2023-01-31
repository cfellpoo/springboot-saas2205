package com.ln.mapper;

import com.ln.pojo.UserView;

import java.util.List;
import java.util.Map;

public interface UserMapper {
   UserView loginUser(UserView userView);
   List<UserView> findAll();

   void delUserById(int id);
   void addUser(UserView userView);

   UserView findUserById(Integer id);
   void updateUserById(UserView userView);
   List<UserView> findAll_page(Map map);
}

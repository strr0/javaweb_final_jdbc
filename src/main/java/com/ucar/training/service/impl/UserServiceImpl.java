package com.ucar.training.service.impl;

import com.ucar.training.dao.impl.UserDaoImpl;
import com.ucar.training.entity.User;
import com.ucar.training.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoImpl impl = new UserDaoImpl();

    //添加
    public void addUser(String name, String sex, int age, String password, String likes, String tag, int admin){
        impl.insertData(name, sex, age, password, likes, tag, admin);
    }

    //删除
    public void deleteUser(int id){
        impl.deleteData(id);
    }

    //获取Users
    public List<User> getUsers(){
        return impl.selectData();
    }

    //用户密码匹配
    public User matchUser(String name, String password){
        return impl.matchUser(name, password);
    }

    //判断是否存在用户名
    public boolean isExistName(String name){
        return impl.existName(name);
    }

    //根据用户名返回User  用于从session中获取用户名 即登录用户 返回用户信息
    public User getUserByName(String name){
        return impl.getUserByName(name);
    }

    //根据用户id返回User
    public User getUserById(int id){
        return impl.getUserById(id);
    }

    //修改用户信息
    public void updateUser(User user){
        int id = user.getId();
        String name = user.getName();
        String sex = user.getSex();
        int age = user.getAge();
        String password = user.getPassword();
        String likes = user.getLike();
        String tag = user.getTag();
        int admin = user.getAdmin();
        impl.updateData(id, name, sex, age, password, likes, tag, admin);
    }

}

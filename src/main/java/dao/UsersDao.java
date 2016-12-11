package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public interface UsersDao {

    List<User> findAll();
    void update(User user);
    void save(User user);
    List<User> findByCity(String city);
    void delete(int id);
}
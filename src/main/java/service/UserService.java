package service;

import model.Auto;
import model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    boolean isRegistered(String name);
    List<User> getUsersByCity(String city);
    List<Auto> getAutoByCity(String city);
    List<User> findAll();
    List<Auto> findAllAuto();
}

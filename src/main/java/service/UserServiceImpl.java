package service;

import dao.AutoDao;
import dao.UsersDao;
import model.Auto;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UsersDao usersDao;
    private AutoDao autoDao;

    public UserServiceImpl(UsersDao usersDao,AutoDao autoDao) {
        this.usersDao = usersDao;
        this.autoDao = autoDao;
    }
    public boolean isRegistered(String name) {
        List<User> users = usersDao.findAll();

        for (User currentUser : users) {
            if (currentUser.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public List<User> getUsersByCity(String city) {
        return usersDao.findByCity(city);
    }

    public List<Auto> getAutoByCity(String city) {
        List<User> usersByCity = usersDao.findByCity(city);
        List<Auto> allAutos = autoDao.findAll();
        List<Auto> autos = new ArrayList<Auto>();
        for (User currentUser : usersByCity) {
            for (Auto currentAuto: allAutos) {
                if(currentUser.getId() == currentAuto.getMemberId()){
                    autos.add(currentAuto);
                }
            }
        }
        return autos;
    }
    public List<User> findAll(){
        List<User> users = usersDao.findAll();
        return users;
    }

    public List<Auto> findAllAuto() {
        List<Auto> autos = autoDao.findAll();
        return autos;
    }
}
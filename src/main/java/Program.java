
import dao.AutoDao;
import dao.UsersDao;
import factory.DaoFactory;
import factory.ServiceFactory;
import model.Auto;
import model.User;
import service.UserService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        UserService userService = ServiceFactory.getInstance().getUserService();
        UsersDao usersDao = DaoFactory.getInstance().getUsersDao();
        AutoDao autoDao = DaoFactory.getInstance().getAutoDao();
        LinkedList a = new LinkedList();
        a.listIterator();
        //usersDao.delete(5);
        //usersDao.update(new User(2,"Yura",26,"Moscow"));
//        AutoDao autoDao = DaoFactory.getInstance().getAutoDao();
//        Auto aut = autoDao.find(0);
//        System.out.println(aut);
        //autoDao.save(new Auto(5,"Toyota",12122,3));
        //autoDao.delete(5);
        List<User> users =  userService.findAll();
        for (User user:users) {
            System.out.println(user);
        }
        List<User> usersByCity =  userService.getUsersByCity("Kazan");
        for (User user:usersByCity) {
            System.out.println(user);
        }
        List<Auto> autos =  userService.getAutoByCity("Moscow");
        for (Auto car:autos) {
            System.out.println(car);
        }
        boolean isRegistered = userService.isRegistered("Ivan");
        System.out.println(isRegistered);
    }
}
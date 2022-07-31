package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Mukagali", "Orazbakov", (byte)26);
        userService.saveUser("Gazek", "Aidarbekov", (byte)25);
        userService.saveUser("Kogam", "Oralhan", (byte)26);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}

package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    // реализуйте алгоритм здесь
    public static void main(String[] args) {

        UserService userServ = new UserServiceImpl();

        userServ.createUsersTable();

        userServ.saveUser("Name1", "LastName1", (byte) 20);
        userServ.saveUser("Name2", "LastName2", (byte) 25);
        userServ.saveUser("Name3", "LastName3", (byte) 31);
        userServ.saveUser("Name4", "LastName4", (byte) 38);

        userServ.removeUserById(1);
        userServ.getAllUsers().forEach(System.out::println);
        userServ.cleanUsersTable();
        userServ.dropUsersTable();

    }
}


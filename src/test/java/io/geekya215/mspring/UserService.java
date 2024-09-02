package io.geekya215.mspring;

public class UserService {
    private int id;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("Query user [" + userDao.queryUserName(id) + "] information");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

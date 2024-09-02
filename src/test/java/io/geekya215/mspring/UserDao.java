package io.geekya215.mspring;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private final static Map<Integer, String> users = new HashMap<>();

    // mock username
    static {
        users.put(1, "mio");
        users.put(2, "rin");
        users.put(3, "uzuki");
    }

    public String queryUserName(int id) {
        return users.get(id);
    }
}

package ru.ottepel.storage;

import org.springframework.stereotype.Component;
import ru.ottepel.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by savetisyan on 17/03/17
 */
@Component
public class InMemoryStorage implements AbstractStorage {
    private Map<Long, User> users = new HashMap<>();

    @Override
    public void saveUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User getUser(long id) {
        return users.get(id);
    }
}
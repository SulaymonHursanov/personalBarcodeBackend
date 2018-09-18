package ru.personal.services.interfaces;

import ru.personal.models.User;

/**
 * Date 03.07.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
public interface UserService {
    void saveUser(User user);
    User getUserByToken(String token);
    void updateUsername(String token, String username, String name, String file);
}

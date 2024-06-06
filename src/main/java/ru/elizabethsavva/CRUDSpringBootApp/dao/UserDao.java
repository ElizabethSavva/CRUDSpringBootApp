package ru.elizabethsavva.CRUDSpringBootApp.dao;

import ru.elizabethsavva.CRUDSpringBootApp.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}

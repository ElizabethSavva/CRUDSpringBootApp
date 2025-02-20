package ru.elizabethsavva.CRUDSpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.elizabethsavva.CRUDSpringBootApp.dao.UserDao;
import ru.elizabethsavva.CRUDSpringBootApp.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Transactional
    @Override
    public void updateUser(Long id, User user) {
        User userToBeUpdated = getUserById(id);
        if (userToBeUpdated != null) {
            userToBeUpdated.setName(user.getName());
            userToBeUpdated.setProfession(user.getProfession());
            userToBeUpdated.setAge(user.getAge());
            userDao.updateUser(userToBeUpdated);
        }
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}

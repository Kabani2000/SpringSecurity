package yes.kabani.cruduser.service;

import yes.kabani.cruduser.dao.UserDao;
import yes.kabani.cruduser.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    @Transactional
    public void removeUser(long id) {
        userDao.removeUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}

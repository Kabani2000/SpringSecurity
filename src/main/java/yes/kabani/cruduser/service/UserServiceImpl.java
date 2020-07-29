package yes.kabani.cruduser.service;

import yes.kabani.cruduser.dao.UserDaoImpl;
import yes.kabani.cruduser.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    UserDaoImpl dao;

    @Autowired
    public void setDao(UserDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public void remove(long id) {
        dao.remove(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }
}

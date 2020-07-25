package yes.kabani.cruduser.dao;

import yes.kabani.cruduser.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User getUser(long id);

    void removeUser(long id);

    void updateUser(User user);

    List<User> listUsers();
}

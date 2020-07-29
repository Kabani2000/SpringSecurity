package yes.kabani.cruduser.dao;

import yes.kabani.cruduser.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User getUser(long id);

    void remove(long id);

    void updateUser(User user);

    public User getUserByName(String login);

    List<User> getUsers();
}

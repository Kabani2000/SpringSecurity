package yes.kabani.cruduser.service;

import yes.kabani.cruduser.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUser(long id);

    void removeUser(long id);

    void updateUser(User user);

    List<User> listUsers();
}

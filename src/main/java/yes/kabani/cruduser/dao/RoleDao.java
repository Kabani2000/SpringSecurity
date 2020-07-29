package yes.kabani.cruduser.dao;

import yes.kabani.cruduser.model.Role;

public interface RoleDao {

    void addRole(Role role);

    Role getRole(String name);

    boolean hasRole(String name);
}

package yes.kabani.cruduser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yes.kabani.cruduser.dao.UserDaoImpl;
import yes.kabani.cruduser.model.Role;
import yes.kabani.cruduser.model.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    UserDaoImpl dao;

    @Autowired
    public void setDao(UserDaoImpl dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return dao.getUserByName(login);
    }
}

package testgroup.Task_231.dao;

import testgroup.Task_231.model.Role;
import testgroup.Task_231.model.User;

import java.util.List;

public interface RoleDAO {

    List<Role> listRoles();

    void add(Role role);

    void delete(Role role);

    void edit(Role role);

    Role getById(long id);

    Role findRoleByName(String role);

}
package arv.userservice.service;

import arv.userservice.model.Role;
import arv.userservice.model.UserModel;

import java.util.List;
import java.util.Optional;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.04.2022
 */
public interface UserService {
    List<UserModel> getUsers();
    public UserModel saveUser(UserModel userModel);
    public Optional<UserModel> findById(Long id);
    List<UserModel> findByRole(Role role);
    List<UserModel> findByName(String name);
}

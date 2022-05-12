package arv.userservice.repo;

import arv.userservice.model.Role;
import arv.userservice.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.04.2022
 */
@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
    List<UserModel> findAllByName(String name);
    List<UserModel> findAllByRole(Role role);
    UserModel findByUsername(String username);
  }

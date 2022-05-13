package arv.userservice.service;

import arv.userservice.model.Role;
import arv.userservice.model.UserModel;
import arv.userservice.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.04.2022
 */
@RequiredArgsConstructor
@Transactional
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public List<UserModel> getUsers() {
        return userRepo.findAll();
    }


    @Override
    public UserModel saveUser(UserModel userModel) {
        return userRepo.save(userModel);
    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public List<UserModel> findByRole(Role role) {
        return userRepo.findAllByRole(role);
    }

    @Override
    public List<UserModel> findByName(String name) {
        return userRepo.findAllByUsername(name);
    }

}

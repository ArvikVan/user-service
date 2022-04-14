package arv.userservice.controller;

import arv.userservice.model.Role;
import arv.userservice.model.UserModel;
import arv.userservice.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.04.2022
 */
@Slf4j
@Controller
@RequestMapping("/user-service")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("/getAllUsers")
    public String showAllUsers(Model model) {
        List<UserModel> userModelList = userService.getUsers();
        model.addAttribute("allUsers", userModelList);
        //model.addAttribute("userModel", new UserModel());
        return "index";
    }
    @GetMapping(value ="/add")
    public String addNewUser(Model model, @ModelAttribute UserModel userModel) {
        userService.saveUser(userModel);
        return "redirect:/";
    }

    @PostMapping("/userById")
    public String showUserById(@RequestParam("id") Long id, Model model) {
        Optional<UserModel> userModel = userService.findById(id);
        model.addAttribute("userById", userModel);
        log.info("getById user");
        return "index";
    }

    @PostMapping("/userByRole")
    public String showUserByRole(@RequestParam("role") Role role,Model model) {
        List<UserModel> userModelList = userService.findByRole(role);
        model.addAttribute("userByRole", userModelList);
        log.info("getUser by Role");
        return "index";
    }

    @PostMapping("/userListByName")
    public String showUserBuName(@RequestParam("name") String name, Model model) {
        List<UserModel> userModelList = userService.findByName(name);
        model.addAttribute("userByName", userModelList);
        log.info("getUser by Name");
        return "index";
    }

    @GetMapping("/getAll")
    public String main() {
        return "index";
    }
}

package arv.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.04.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usermodel")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> role = new ArrayList<>();
    private LocalDateTime createdAt = LocalDateTime.now();
}

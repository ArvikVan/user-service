package arv.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private String name;
    private Role role;
    private LocalDateTime createdAt = LocalDateTime.now();
}

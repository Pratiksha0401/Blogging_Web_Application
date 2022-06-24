package com.blogapp.entities;

import com.blogapp.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "uuid-char")
    private UUID userId;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private String about;

    private LocalDateTime createdAt = LocalDateTime.now();

    public User(UserDTO userDTO) {
        this.name = userDTO.name;
        this.email = userDTO.email;
        this.password = userDTO.password;
        this.phoneNumber = userDTO.phoneNumber;
        this.about = userDTO.about;
    }

    public User(UUID uuid,UserDTO userDTO) {
        this.userId = uuid;
        this.name = userDTO.name;
        this.email = userDTO.email;
        this.password = userDTO.password;
        this.phoneNumber = userDTO.phoneNumber;
        this.about = userDTO.about;
    }
}

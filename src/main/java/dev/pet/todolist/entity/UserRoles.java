package dev.pet.todolist.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.EnableMBeanExport;

import java.io.StringBufferInputStream;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults (level = AccessLevel.PRIVATE)
@Entity
@Table(name="UserRoles")
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @ManyToOne
    @JoinColumn(name="user_id")
    User user;
    @ManyToOne
    @JoinColumn(name="role_id")
    Role role;
}

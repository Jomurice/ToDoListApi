package dev.pet.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ListIndexBase;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Role")
public class Role {
    @Id
    String id;
    String name;

    @OneToMany(mappedBy = "role")
    List<UserRoles> userRoles;
}

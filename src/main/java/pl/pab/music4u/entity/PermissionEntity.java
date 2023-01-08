package pl.pab.music4u.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "PERMISSION")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "permission_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class PermissionEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "permissionEntity")
    private Set<EmployeeEntity> employee = new HashSet<>();
    @OneToMany(mappedBy = "permissionEntity")
    private Set<CustomerEntity> customer = new HashSet<>();
    //fk def
}

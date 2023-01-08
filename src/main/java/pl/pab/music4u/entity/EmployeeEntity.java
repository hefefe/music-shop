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
@NoArgsConstructor
@Table(name = "EMPLOYEE")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "employee_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class EmployeeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surname;
    @Column(length = 50, nullable = false)
    private String login;
    @Column(length = 512, nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean isactive;
    //pk def
    @OneToMany(mappedBy = "employeeEntity")
    private Set<OrderEntity> order = new HashSet<>();
    //fk def
    @ManyToOne
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private AdressEntity adressEntity;

    @ManyToOne
    @JoinColumn(name = "contact_id", referencedColumnName = "id")
    private ContactEntity contactEntity;

    @ManyToOne
    @JoinColumn(name = "permission_id", referencedColumnName = "id")
    private PermissionEntity permissionEntity;


}

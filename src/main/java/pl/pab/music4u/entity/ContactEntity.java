package pl.pab.music4u.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "CONTACT")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "contact_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class ContactEntity extends BaseEntity{
    @Column( length = 20)
    private String phone;
    @Column(length = 50)
    private String email;
    //pk def
    @OneToMany(mappedBy = "contactEntity")
    private Set<EmployeeEntity> employee = new HashSet<>();
    @OneToMany(mappedBy = "contactEntity")
    private Set<CustomerEntity> customer = new HashSet<>();
    //fk def
}

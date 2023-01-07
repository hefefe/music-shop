package pl.pab.music4u.entity;

import lombok.*;

import javax.persistence.*;
import javax.websocket.OnOpen;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ADRESS")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "adress_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class AdressEntity extends BaseEntity{
    @Column(length = 50, nullable = false)
    private String locality;
    @Column(length = 50, nullable = false)
    private String state;
    @Column( length = 5, nullable = false)
    private String zipcode;
    @Column(length = 50)
    private String street;
    @Column(length = 10, nullable = false)
    private String number;
    @Column(length = 10)
    private String apartmentNumber;
    //pk def
    @OneToMany(mappedBy = "adressEntity")
    private Set<EmployeeEntity> employee = new HashSet<>();
    @OneToMany(mappedBy = "adressEntity")
    private Set<CustomerEntity> customer = new HashSet<>();
    @OneToMany(mappedBy = "adressEntity")
    private Set<WarehouseEntity> warehouse = new HashSet<>();
    //fk def
}

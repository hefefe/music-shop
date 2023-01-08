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
@Table(name = "WAREHOUSE")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "warehouse_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class WarehouseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "warehouseEntity")
    private Set<WarehouseStateEntity> warehouseState = new HashSet<>();
    //fk def
    @ManyToOne
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private AdressEntity adressEntity;
}

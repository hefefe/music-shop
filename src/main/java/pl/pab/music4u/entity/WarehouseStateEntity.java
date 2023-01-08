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
@Table(name = "WAREHOUSE_STATE")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "warehouse_state_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class WarehouseStateEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(nullable = false)
    private Integer amount;
    @Column(nullable = false)
    private boolean status;
    //pk def
    @OneToMany(mappedBy = "warehouseStateEntity")
    private Set<ProductEntity> product = new HashSet<>();
    //fk def
    @ManyToOne
    @JoinColumn(name = "warehouse_id", referencedColumnName = "id")
    private WarehouseEntity warehouseEntity;
}

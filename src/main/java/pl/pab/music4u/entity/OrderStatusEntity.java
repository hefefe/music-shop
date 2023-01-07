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
@Table(name = "ORDER_STATUS")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "order_status_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class OrderStatusEntity extends BaseEntity{
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "orderStatusEntity")
    private Set<OrderEntity> order = new HashSet<>();
    //fk def
}

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
@Table(name = "ORDER_STATUS")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "order_status_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class OrderStatusEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "orderStatusEntity")
    private Set<OrderEntity> order = new HashSet<>();
    //fk def
}

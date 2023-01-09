package pl.pab.music4u.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "discount_codes_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class DiscountCodesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 25, nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer value;
    @OneToMany(mappedBy = "discountCodesEntity")
    private Set<OrderElementsEntity> orderElements = new HashSet<>();

}

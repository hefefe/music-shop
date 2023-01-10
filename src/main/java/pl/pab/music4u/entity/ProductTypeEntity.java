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
@Table(name = "PRODUCT_TYPE")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "product_type_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class ProductTypeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "productTypeEntity")
    private Set<ProductEntity> product = new HashSet<>();
    //fk def
}

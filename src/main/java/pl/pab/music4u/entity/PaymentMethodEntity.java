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
@Table(name = "PAYMENT_METHOD")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "payment_method_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class PaymentMethodEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    //pk def
    @OneToMany(mappedBy = "paymentMethodEntity")
    private Set<PaymentEntity> payment = new HashSet<>();
    //fk def
}

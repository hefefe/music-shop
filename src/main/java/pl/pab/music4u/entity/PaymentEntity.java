package pl.pab.music4u.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "PAYMENT")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "payment_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class PaymentEntity extends BaseEntity{
    @Column(nullable = false)
    private Timestamp date;
    @Column(precision=100, scale=2, nullable = false)
    private BigDecimal grossPrice;
    @Column(precision=100, scale=2, nullable = false)
    private BigDecimal netPrice;
    @Column(nullable = false)
    private boolean isPaid;
    @Column(length = 50)
    private String bankAccountNumber;
    @Column(nullable = false)
    private Integer tax;
    //pk def
    //fk def
    @ManyToOne
    @JoinColumn(name = "payment_method_id", referencedColumnName = "id")
    private PaymentMethodEntity paymentMethodEntity;
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderEntity orderEntity;
}

package pl.pab.music4u.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "ORDERS")
@SequenceGenerator(name = "generator_seq",
    sequenceName = "order_id_seq",
    allocationSize = 1,
    initialValue = 1)
public class OrderEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column( nullable = false)
    private Timestamp date;
    //pk def
    @OneToMany(mappedBy = "orderEntity")
    private Set<PaymentEntity> payment = new HashSet<>();
    @OneToMany(mappedBy = "orderEntity")
    private Set<OrderElementsEntity> orderElements = new HashSet<>();
    //fk def
    @ManyToOne
    @JoinColumn(name = "order_status_id", referencedColumnName = "id")
    private OrderStatusEntity orderStatusEntity;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private EmployeeEntity employeeEntity;


}

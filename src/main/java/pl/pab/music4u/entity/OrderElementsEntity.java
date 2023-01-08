package pl.pab.music4u.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "ORDER_ELEMENTS")
@SequenceGenerator(name = "generator_seq",
        sequenceName = "order_elements_id_seq",
        allocationSize = 1,
        initialValue = 1)
public class OrderElementsEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_seq")
    private Long id;
    @Column(nullable = false)
    private Integer itemAmount;
    @Column(nullable = false)
    private String remark;
    @Column(nullable = false)
    private Integer discount;
    //pk def
    //fk def
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderEntity orderEntity;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity productEntity;



}

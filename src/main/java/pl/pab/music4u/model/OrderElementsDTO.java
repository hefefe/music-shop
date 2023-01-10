package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pl.pab.music4u.entity.OrderEntity;
import pl.pab.music4u.entity.ProductEntity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderElementsDTO {
    private Long id;
    private Integer itemAmount;
    private String remark;
    private Integer discount;
    private Long discountCodesId;
    private Long productId;
    private Long orderId;
}

package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderElementsDTO {
    private Long id;
    private Integer itemAmount;
    private String remark;
    private Integer discount;
}

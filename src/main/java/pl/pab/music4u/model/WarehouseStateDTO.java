package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pl.pab.music4u.entity.WarehouseEntity;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class WarehouseStateDTO {
    private Long id;
    private Integer amount;
    private boolean status;
    private int warehouseId;
}

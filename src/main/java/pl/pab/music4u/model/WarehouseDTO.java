package pl.pab.music4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pl.pab.music4u.entity.AdressEntity;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class WarehouseDTO {
    private Long id;
    private String name;
    private int adressId;
}

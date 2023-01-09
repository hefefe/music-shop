package pl.pab.music4u.model;

import org.mapstruct.Mapper;
import pl.pab.music4u.entity.DiscountCodesEntity;

@Mapper(componentModel = "spring")
public interface DiscountCodesMapper {
    DiscountCodesEntity dtoToEntity(DiscountCodesDTO discountCodesDTO);
    DiscountCodesDTO entityToDTO(DiscountCodesEntity discountCodesEntity);
}

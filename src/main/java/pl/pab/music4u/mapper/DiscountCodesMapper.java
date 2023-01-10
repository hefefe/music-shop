package pl.pab.music4u.mapper;

import org.mapstruct.Mapper;
import pl.pab.music4u.entity.DiscountCodesEntity;
import pl.pab.music4u.model.DiscountCodesDTO;

@Mapper(componentModel = "spring")
public interface DiscountCodesMapper {
    DiscountCodesEntity dtoToEntity(DiscountCodesDTO discountCodesDTO);
    DiscountCodesDTO entityToDTO(DiscountCodesEntity discountCodesEntity);
}

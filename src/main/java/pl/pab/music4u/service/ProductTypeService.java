package pl.pab.music4u.service;

import pl.pab.music4u.entity.ArtistEntity;
import pl.pab.music4u.entity.ProductTypeEntity;

public interface ProductTypeService {

    ProductTypeEntity findById(Long id);
    Long map(ProductTypeEntity productTypeEntity);
}

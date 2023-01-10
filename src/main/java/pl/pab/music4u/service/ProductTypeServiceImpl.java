package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.ProductTypeEntity;
import pl.pab.music4u.exception.GenreNotFoundException;
import pl.pab.music4u.exception.ProductTypeNotFoundException;
import pl.pab.music4u.mapper.ProductTypeMapper;
import pl.pab.music4u.repository.ProductRepository;
import pl.pab.music4u.repository.ProductTypeRepository;

@Service
@RequiredArgsConstructor
public class ProductTypeServiceImpl implements ProductTypeService{
    private final ProductTypeRepository productTypeRepository;
    private final ProductTypeMapper productTypeMapper;
    @Override
    public ProductTypeEntity findById(Long id) {
        return productTypeRepository.findById(id).orElseThrow(ProductTypeNotFoundException::new);
    }

    @Override
    public Long map(ProductTypeEntity productTypeEntity) {
        return productTypeEntity.getId();
    }
}

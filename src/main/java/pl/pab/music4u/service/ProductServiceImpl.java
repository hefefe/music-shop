package pl.pab.music4u.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pab.music4u.entity.ProductEntity;
import pl.pab.music4u.exception.ProductNotFoundException;
import pl.pab.music4u.model.ProductDTO;
import pl.pab.music4u.mapper.ProductMapper;
import pl.pab.music4u.projection.Productprojection;
import pl.pab.music4u.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream().map(productMapper::entityToDTO).collect(Collectors.toList());
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id).map(productMapper::entityToDTO).orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductEntity findById(Long id) {
        return productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public Long map(ProductEntity productEntity) {
        return productEntity.getId();
    }

    @Override
    public List<Productprojection> getListOfProducts() {
        return productRepository.getListOfProducts();
    }
}

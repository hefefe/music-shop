package pl.pab.music4u.service;

import pl.pab.music4u.entity.ProductEntity;
import pl.pab.music4u.entity.WarehouseStateEntity;
import pl.pab.music4u.model.GenreDTO;
import pl.pab.music4u.model.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO addProduct(ProductDTO productDTO);
    ProductDTO updateProduct(ProductDTO productDTO);
    ProductDTO getProductById(Long id);
    void deleteProduct(Long id);
    ProductEntity findById(Long id);
    Long map(ProductEntity productEntity);
}

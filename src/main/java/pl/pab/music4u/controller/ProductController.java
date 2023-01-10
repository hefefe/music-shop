package pl.pab.music4u.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pab.music4u.entity.ProductEntity;
import pl.pab.music4u.mapper.ProductMapper;
import pl.pab.music4u.model.ProductDTO;
import pl.pab.music4u.repository.ProductRepository;
import pl.pab.music4u.service.GenreService;
import pl.pab.music4u.service.ProductService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/entitytodto/{id}")
    public ProductDTO productToDTO(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }
}

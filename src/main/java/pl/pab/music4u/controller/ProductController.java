package pl.pab.music4u.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pab.music4u.projection.Productprojection;
import pl.pab.music4u.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private final ProductService productService;

    @GetMapping("/products")
    public String getCategories(Model model){
        model.addAttribute("products", productService.getListOfProducts());
        return "products";
    }

}

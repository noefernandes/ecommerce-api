package br.com.ecommerce.controller;

import br.com.ecommerce.dto.ProductDTO;
import br.com.ecommerce.model.Product;
import br.com.ecommerce.service.ProductService;
import br.com.ecommerce.utils.DTOUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDTO getProduct(@PathVariable Long id) {
        Product product = productService.getProduct(id);
        return DTOUtils.fromEntityToDTO(product, ProductDTO.class);
    }

    @GetMapping("/products")
    public List<ProductDTO> getProducts() {
        List<Product> products = productService.getProducts();
        return DTOUtils.fromEntityListToDTOList(products, ProductDTO.class);
    }

    @PostMapping("/product")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO) {
        Product product = DTOUtils.fromDTOToEntity(productDTO, Product.class);
        Product p = productService.saveProduct(product);
        return DTOUtils.fromEntityToDTO(p, ProductDTO.class);
    }
}

package br.com.ecommerce.controller;

import br.com.ecommerce.service.ProductDetailsService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetailsController {
    private final ProductDetailsService productDetailsService;

    public ProductDetailsController(ProductDetailsService productDetailsService) {
        this.productDetailsService = productDetailsService;
    }
}

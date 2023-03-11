package br.com.ecommerce.service;

import br.com.ecommerce.repository.ProductDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService {
    private final ProductDetailsRepository productDetailsRepository;

    public ProductDetailsService(ProductDetailsRepository productDetailsRepository) {
        this.productDetailsRepository = productDetailsRepository;
    }
}

package br.com.ecommerce.controller;

import br.com.ecommerce.service.PurchaseService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {
    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }
}

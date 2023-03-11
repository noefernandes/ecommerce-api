package br.com.ecommerce.controller;

import br.com.ecommerce.service.AddressService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
}

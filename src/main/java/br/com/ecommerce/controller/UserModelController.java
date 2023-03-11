package br.com.ecommerce.controller;

import br.com.ecommerce.service.UserModelService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserModelController {
    private final UserModelService userModelService;

    public UserModelController(UserModelService userModelService) {
        this.userModelService = userModelService;
    }
}

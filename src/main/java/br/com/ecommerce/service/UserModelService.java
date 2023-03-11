package br.com.ecommerce.service;

import br.com.ecommerce.repository.UserModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UserModelService {
    private final UserModelRepository userModelRepository;

    public UserModelService(UserModelRepository userModelRepository) {
        this.userModelRepository = userModelRepository;
    }
}

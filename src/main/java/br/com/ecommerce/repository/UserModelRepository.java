package br.com.ecommerce.repository;

import br.com.ecommerce.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModelRepository extends JpaRepository<UserModel, Long> {
}

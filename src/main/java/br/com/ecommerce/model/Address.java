package br.com.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String country;
    private String city;
    private String street;
    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private UserModel userModel;
}

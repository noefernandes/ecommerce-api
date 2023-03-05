package br.com.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDetails {
    @Id
    Long id;
    @Column(unique = true, nullable = false)
    String name;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    Product product;
    @Column(nullable = false)
    BigDecimal price;
    String description;
}
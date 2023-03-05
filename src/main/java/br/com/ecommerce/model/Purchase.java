package br.com.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Purchase {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "purchase")
    private List<Item> items;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserModel userModel;
}
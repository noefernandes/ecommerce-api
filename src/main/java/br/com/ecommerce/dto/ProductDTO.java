package br.com.ecommerce.dto;

import br.com.ecommerce.model.Category;
import br.com.ecommerce.model.Item;
import br.com.ecommerce.model.ProductDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private ProductDetails productDetails;
    private Category category;
    private Item item;
}

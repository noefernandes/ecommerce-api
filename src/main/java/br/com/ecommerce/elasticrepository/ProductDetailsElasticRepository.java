package br.com.ecommerce.elasticrepository;

import br.com.ecommerce.model.ProductDetails;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductDetailsElasticRepository extends ElasticsearchRepository<ProductDetails, Long> {
}

package com.target.product.productservices;

import com.target.product.model.external.Product;
import com.target.product.repository.ProductRepository;
import com.target.product.model.datasource.ProductCurrency;
import com.target.product.model.Products;
import com.target.product.productentity.ProductsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ProductRepository productRepository;
    public Products getProductById(Integer productId) throws Exception {
        return new Products(productId ,getProductName(productId), getCurrencyInfo(productId));

    }

    private String getProductName(Integer productId) throws Exception {
            Product product = restTemplate.getForObject("https://redsky.target.com/v2/pdp/tcin/"+productId+
                            "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews, rating_and_review_statistics,question_answer_statistics" ,
                    Product.class);
            return product.getProductVO().getItemVO().getProductDescriptionVO().getTitle();
    }

    private  ProductCurrency getCurrencyInfo(Integer productId) throws Exception {
        ProductsEntity productsEntity = productRepository.findById(productId).get();
        ProductCurrency currency =new ProductCurrency(productsEntity.getValue(),productsEntity.getCurrencyCode());
        return currency;
    }
}

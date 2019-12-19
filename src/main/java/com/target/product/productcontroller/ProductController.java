package com.target.product.productcontroller;

import com.target.product.model.Products;
import com.target.product.productservices.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductServices productServices;
    @RequestMapping("/{productId}")
    public Products getProductById(@PathVariable Integer productId) throws Exception {
        return productServices.getProductById(productId);

    }


}

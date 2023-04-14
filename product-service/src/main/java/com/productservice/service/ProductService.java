package com.productservice.service;

import com.productservice.Repository.ProductRepository;
import com.productservice.dto.ProductRequest;
import com.productservice.dto.ProductResponse;
import com.productservice.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


public interface ProductService {
    void createProduct(ProductRequest productRequest);
}

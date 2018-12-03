package com.ctf.service.product;

import com.ctf.dao.product.ProductMapper;
import com.ctf.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> getProdectList() {
        return productMapper.getProdectList();
    }

    @Override
    public int getQuantity(String productName) {
        return productMapper.getQuantity(productName);
    }

    @Override
    public int updateQuantity(Product product) {
        return productMapper.updateQuantity(product);
    }
}

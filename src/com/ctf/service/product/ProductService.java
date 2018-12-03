package com.ctf.service.product;

import com.ctf.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {

    //查询所有商品
    List<Product> getProdectList();

    //查询指定商品的库存
    int getQuantity(@Param("productName")String productName);

    //修改指定商品的库存
    int updateQuantity(@Param("product")Product product);

}

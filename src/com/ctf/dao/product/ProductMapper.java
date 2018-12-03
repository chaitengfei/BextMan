package com.ctf.dao.product;

import com.ctf.entity.Product;import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    /**
     * A．登录所需的查询
     *   B．查询所有商品
     *   C．查询指定商品的库存
     *   D．修改指定商品的库存
     *   E．添加销售记录
     *   F．对销售记录按指定的排序规则分页查询
     */

    int insert(Product product);

    //查询所有商品
    List<Product> getProdectList();

    //查询指定商品的库存
    int getQuantity(@Param("productName")String productName);

    //修改指定商品的库存
    int updateQuantity(@Param("product")Product product);


}

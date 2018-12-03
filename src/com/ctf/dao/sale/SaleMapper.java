package com.ctf.dao.sale;

import com.ctf.entity.Sale;
import com.ctf.util.PageBean;

import java.util.List;

public interface SaleMapper {

    /**
     * A．登录所需的查询
     *   B．查询所有商品
     *   C．查询指定商品的库存
     *   D．修改指定商品的库存
     *   E．添加销售记录
     *   F．对销售记录按指定的排序规则分页查询
     */

    //添加销售记录
    int insertSale(Sale sale);

    //对销售记录按指定的排序规则分页查询
    List<Sale> getSaleList(PageBean pageBean);


    int getSaleCount();

}

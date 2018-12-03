package com.ctf.service.sale;

import com.ctf.entity.Sale;
import com.ctf.util.PageBean;

import java.util.List;

public interface SaleService {

    //添加销售记录
    int insertSale(Sale sale);

    //对销售记录按指定的排序规则分页查询
    List<Sale> getSaleList(PageBean pageBean);

    int getSaleCount();

}

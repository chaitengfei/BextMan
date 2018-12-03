package com.ctf.service.sale;

import com.ctf.dao.sale.SaleMapper;
import com.ctf.entity.Sale;
import com.ctf.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class SaleServiceImpl implements SaleService {

    @Resource
    private SaleMapper saleMapper;

    @Override
    public int insertSale(Sale sale) {
        return saleMapper.insertSale(sale);
    }

    @Override
    public List<Sale> getSaleList(PageBean pageBean) {
        int totalCount = saleMapper.getSaleCount();
        pageBean.setTotalCount(totalCount);

        List<Sale> result = saleMapper.getSaleList(pageBean);
        pageBean.setResult(result);

        return saleMapper.getSaleList(pageBean);
    }

    @Override
    public int getSaleCount() {
        return saleMapper.getSaleCount();
    }
}

package com.ctf.controller;


import com.ctf.entity.Sale;
import com.ctf.service.sale.SaleService;
import com.ctf.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/dev/sale")
public class SaleController {

    @Resource
    private SaleService saleService;

    @RequestMapping("list")
    public String saleList(Model model, String pageIndex){
        Integer currentPageNo = 1;
        Integer pageSize = 5;
        if(pageIndex!=null){
            currentPageNo = Integer.parseInt(pageIndex);
        }

        PageBean<Sale> pageBean = new PageBean<Sale>();
        pageBean.setCurrentPageNo(currentPageNo);
        pageBean.setPageSize(pageSize);
        saleService.getSaleList(pageBean);

        System.out.println(pageIndex);
        System.out.println(pageBean.getStartIndex());
        System.out.println(pageBean.getPageSize());
        System.out.println(pageBean.getTotalPage());

        model.addAttribute("pageBean", pageBean);
        return "developer/appinfolist";
    }

    @RequestMapping("saleadd")
    public String addSale(Sale sale){

        saleService.insertSale(sale);

        return "redirect:/dev/sale/list";
    }
}

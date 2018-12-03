package com.ctf.controller;


import com.ctf.entity.Product;
import com.ctf.service.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("dev/pro")
public class ProductController {

    @Resource
    private ProductService productService;



    /**
     *  查看库存
     * @return
     */
    @RequestMapping("sel")
    public String selP(Model model){
        List<Product> list = productService.getProdectList();

        model.addAttribute("list",list);
    return "developer/selpro";
}
@RequestMapping("update")
    public String upd(@RequestParam String productName , Model model){

        System.out.println(productName);

        int num = productService.getQuantity(productName);

        model.addAttribute("num",num);

        return "developer/updatepro";
    }

}

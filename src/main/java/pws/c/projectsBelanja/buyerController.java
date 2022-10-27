/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pws.c.projectsBelanja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Abian
 */
@Controller
public class buyerController {
    
    computeMarket data = new computeMarket();
    
    @RequestMapping("/buyer")
    public String buyer(@RequestParam(value="nama") String nama,
                        @RequestParam(value="harga") String harga,
                        @RequestParam(value="item") String item,
                        Model model){
        
        double price, list, totBarang, diskon, ketDiskon;
        
        price = Double.parseDouble(harga);
        list = Double.parseDouble(item);
        
        // Proses Perhitungan
        totBarang = data.getTotal(price, list);
        diskon = data.getDiskon(price, list);
        ketDiskon = data.ketDiskon(price, list);
        
        model.addAttribute("name", nama);
        model.addAttribute("price","Rp " +price);
        model.addAttribute("list", list);
        model.addAttribute("total", "Rp " + totBarang); // total sebelum diskon
        model.addAttribute("diskon", "Rp " + diskon ); // total akhir
        model.addAttribute("ketDiskon ", ketDiskon + " %");
        
        
        return "view";
    }
}

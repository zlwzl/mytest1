package com.itheima.girl.controller;

import com.itheima.girl.dao.GirlRepository;
import com.itheima.girl.domain.Girl;
import com.itheima.girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 14:54 2017/11/1
 */
@Controller
@RequestMapping("/girls")
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    //http://localhost:8888/girls/girls/find/1
    //@RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    @GetMapping("/find/{id}")
    @ResponseBody
    public Girl findOne(@PathVariable("id") Integer id) {

        Girl girl = girlRepository.findOne(id);
        return girl;
    }

    @PostMapping("/save")
    @ResponseBody
    public String save(@Valid Girl girl, BindingResult result) {
        //判断是否校验
       if(result.hasErrors()) {
           String message = result.getFieldError().getDefaultMessage();
           System.out.println(message);
           return "failure";
       }
        girlRepository.save(girl);
        return "success";
    }


    @GetMapping("/age/{id}")
    public void getAgeById(@PathVariable("id") Integer id) throws Exception{
        girlService.getAgeById(id);
    }



}

package com.itheima.girl.controller;

import com.itheima.girl.dao.ReadingListRepository;
import com.itheima.girl.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 14:40 2017/11/3
 */
@Controller
@RequestMapping("/")
public class BookController {

    @Autowired
    private ReadingListRepository readingListRepository;

    /**
     * 通过读者的姓名查询书籍
     * @return
     */
    @GetMapping("/{reader}")
    public String findByReader(@PathVariable("reader") String reader, Model model) {
        System.out.println(reader);
        //girlRepository.save
        List<Book> list = readingListRepository.findByReader(reader);
        if(list != null) {
            model.addAttribute("books",list);
        }
        return "readingList";
    }



}

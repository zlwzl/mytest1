package com.itheima.girl.dao;

import com.itheima.girl.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 14:45 2017/11/3
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {

    List<Book> findByReader(String reader);
}

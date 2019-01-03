package com.itheima.girl.dao;

import com.itheima.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 15:19 2017/11/1
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
}

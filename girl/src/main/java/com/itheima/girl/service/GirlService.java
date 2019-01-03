package com.itheima.girl.service;

import com.itheima.girl.dao.GirlRepository;
import com.itheima.girl.domain.Girl;
import com.itheima.girl.enums.ResultEnums;
import com.itheima.girl.exception.GirlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 20:05 2017/11/12
 */
@Service
public class GirlService {


    @Autowired
    private GirlRepository girlRepository;

    public void getAgeById(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        if(girl.getAge() < 14) {
            throw new GirlException(ResultEnums.PRIMARY_SCHOOL);
        }else if (girl.getAge() >14 && girl.getAge() < 18){
            throw new GirlException(ResultEnums.MIDDLE_SCHOOL);
        }else {
            throw new GirlException(ResultEnums.ADD_MONEY);
        }
    }
}

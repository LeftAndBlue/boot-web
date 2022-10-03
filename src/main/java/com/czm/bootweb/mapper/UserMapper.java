package com.czm.bootweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czm.bootweb.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;




public interface UserMapper extends BaseMapper<User> {

}

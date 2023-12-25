package com.example.mybatisfirst.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisfirst.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

}

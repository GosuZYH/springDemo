package com.example.myspring.mapper;

import com.example.myspring.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM tb_user WHERE name = #{name}")
    public User findByName(String name);
}

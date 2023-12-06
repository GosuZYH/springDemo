package com.example.orderservice.mapper;

import com.example.orderservice.entities.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {
    @Select("SELECT * FROM tb_order WHERE id = #{id}")
    public Order findById(Integer id);
}

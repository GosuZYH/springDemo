/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : Order
 *     Time     : 2023/12/6-14:13
 *******************************************************************************/
package com.example.orderservice.entities;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String user_id;
    private String name;
    private Integer price;
    private Integer num;
}

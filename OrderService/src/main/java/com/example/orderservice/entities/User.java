/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : User
 *     Time     : 2023/12/7-9:53
 *******************************************************************************/
package com.example.orderservice.entities;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String address;
}

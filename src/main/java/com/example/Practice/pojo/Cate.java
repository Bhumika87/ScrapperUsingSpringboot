package com.example.Practice.pojo;

import lombok.*;

import java.util.Date;
@Data
public class Cate {
    private int id;
    private String title;
    private Date created_at;
    private Date updated_at;
    private int clues_count;
}

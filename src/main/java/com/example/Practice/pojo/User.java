package com.example.Practice.pojo;

import com.example.Practice.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;

@Data
public class User {
   private int id;
   private String answer;
   private String Question;
   private int value;
   private Date airdate;
   private Date created_at;
   private Date updated_at;
   private int category_id;
   private int game_id;
   private int invalid_count;
   private Category category;

}


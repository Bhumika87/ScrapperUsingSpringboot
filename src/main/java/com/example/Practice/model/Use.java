package com.example.Practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="rec")
public class Use {
    String answer;
    String Question;
    int value;
    Date airdate;
    Date created_at;
    Date updated_at;
    int category_id;
    int game_id;
    int invalid_count;
  Category category;

}

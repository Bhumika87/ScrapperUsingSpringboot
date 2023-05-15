package com.example.Practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_records")
public class FetchingData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String answer;

    private String question;

    private int value;

    @Temporal(TemporalType.TIMESTAMP)
    private Date airdate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;
    @Column(name = "category_id", insertable = false, updatable = false)

    private Integer category_id;

    private Integer game_id;

    private Integer invalid_count;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

}

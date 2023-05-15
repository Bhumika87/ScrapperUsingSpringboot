package com.example.Practice.repository;

import com.example.Practice.model.FetchingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

@Validated
@Repository
public interface UseRepo extends JpaRepository<FetchingData,String> {
  //    public List<Book> findByPublication(String publication);
  @Query("SELECT q.category_id  FROM FetchingData q WHERE q.question = :question")
  public int findCatId(String question);
  @Query("SELECT q.answer  FROM FetchingData q WHERE q.category_id = :category_id")
  public String findAns(int category_id);



}

package com.example.Practice.repository;

import com.example.Practice.model.Use;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

@Validated
@Repository
public interface UseRepo extends MongoRepository<Use,String> {
}

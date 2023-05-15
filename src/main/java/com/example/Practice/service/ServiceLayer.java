package com.example.Practice.service;

import com.example.Practice.model.FetchingData;
import com.example.Practice.pojo.User;
import com.example.Practice.repository.UseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
    private final RestTemplate restTemplate;
    private final UseRepo useRepo;
    @Autowired
    public ServiceLayer(UseRepo useRepo,RestTemplate restTemplate)
    {
        this.useRepo = useRepo;
        this.restTemplate=restTemplate;
    }
    public User[] consumeAPI() {
        User[] user = restTemplate.getForObject("https://jservice.io/api/random", User[].class);
        //System.out.println(user[0].getId());

        FetchingData user2 = new FetchingData();
        user2.setId(user[0].getId());
        user2.setAnswer(user[0].getAnswer());
        user2.setValue(user[0].getValue());
        user2.setAirdate(user[0].getAirdate());
        user2.setCreated_at(user[0].getCreated_at());
        user2.setUpdated_at(user[0].getUpdated_at());
        user2.setCategory_id(user[0].getCategory_id());
        user2.setGame_id(user[0].getGame_id());
        user2.setInvalid_count(user[0].getInvalid_count());
        user2.setCategory(user[0].getCategory());
        user2.setQuestion(user[0].getQuestion());
        useRepo.save(user2);
        return user;
    }
    public String consumeQuestion() {
        User[] user = restTemplate.getForObject("https://jservice.io/api/random", User[].class);
        //need to add this record into database for matching the answer for next api

        FetchingData user2 = new FetchingData();
        user2.setId(user[0].getId());
        user2.setAnswer(user[0].getAnswer());
        user2.setValue(user[0].getValue());
        user2.setAirdate(user[0].getAirdate());
        user2.setCreated_at(user[0].getCreated_at());
        user2.setUpdated_at(user[0].getUpdated_at());
        user2.setCategory_id(user[0].getCategory_id());
        user2.setGame_id(user[0].getGame_id());
        user2.setInvalid_count(user[0].getInvalid_count());
        user2.setCategory(user[0].getCategory());
        user2.setQuestion(user[0].getQuestion());
        useRepo.save(user2);

        //return question
        String que= user[0].getQuestion();
        return que;

    }
    public int consumecatId(String question){

             return useRepo.findCatId(question);
    }
    public String consumeAns(int category_id){
        return useRepo.findAns(category_id);
    }



}

package com.example.demo.usecase.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.domain.model.Tweet;
import com.example.demo.usecase.repository.TweetRepository;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class TweetService {
   TweetRepository tweetRepositroy;
   
   TweetService(TweetRepository tweetRepository) {
       this.tweetRepositroy = tweetRepository;
   }

   public Tweet postTweet(Tweet tweet) {
       return tweetRepositroy.save(tweet);
   }

   public List<Tweet> getTweet() {
       return tweetRepositroy.findAll();
   }
}

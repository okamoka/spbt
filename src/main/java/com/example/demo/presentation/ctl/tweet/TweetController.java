package com.example.demo.presentation.ctl.tweet;

import java.util.List;

import com.example.demo.domain.model.Tweet;
import com.example.demo.usecase.service.TweetService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tweet")
public class TweetController {
   TweetService tweetService;
   
   TweetController(TweetService tweetService) {
       this.tweetService = tweetService;
   }

   @PostMapping
   Tweet postTweet(@RequestBody Tweet tweet) {
        return tweetService.postTweet(tweet);
   }

   @GetMapping
   List<Tweet> getTweet() {
       return tweetService.getTweet();
   }
}

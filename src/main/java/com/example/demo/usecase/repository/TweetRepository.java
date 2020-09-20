package com.example.demo.usecase.repository;

import com.example.demo.domain.model.Tweet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {}
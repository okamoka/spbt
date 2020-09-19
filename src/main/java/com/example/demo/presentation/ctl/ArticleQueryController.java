package com.example.demo.presentation.ctl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleQueryController {
     private final ArticleQueryService service;

     ArticleQueryController(final ArticleQueryService articleQueryService) {
         this.service = articleQueryService;
     }

     @GetMapping
     public ResponseEntity<ArticleListQueryResponse> list() {
         return  ResponseEntity.ok(service.list());
     }
}

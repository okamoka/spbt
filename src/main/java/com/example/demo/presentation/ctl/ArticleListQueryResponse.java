package com.example.demo.presentation.ctl;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleListQueryResponse {
    private List<Article> articles;

    @Data
    @AllArgsConstructor
	public static class Article {
        private String title;
        private String authorName;
        private long likeCount;
	}
}

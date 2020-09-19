package com.example.demo.infrastructure.query;

import com.example.demo.presentation.ctl.ArticleListQueryResponse;
import com.example.demo.presentation.ctl.ArticleQueryService;

import org.springframework.stereotype.Service;

@Service
public class ArticleMySqlQueryService implements ArticleQueryService {

    ArticleMySQLQueryMapper mapper;

    ArticleMySqlQueryService(ArticleMySQLQueryMapper articleMySqlQueryMapper) {
        this.mapper = articleMySqlQueryMapper;
    }
    @Override
    public ArticleListQueryResponse list() {
        return new ArticleListQueryResponse(mapper.list());
    }

}

package com.example.demo.infrastructure.query;

import java.util.List;

import com.example.demo.presentation.ctl.ArticleListQueryResponse;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMySQLQueryMapper {
    List<ArticleListQueryResponse.Article> list();
}

package com.example.Blog_Management.service;


import com.example.Blog_Management.model.Article;
import com.example.Blog_Management.model.Comment;


import java.util.List;


public interface BlogService {

    Article AddArticle(Article article);
    Comment AddComment(Comment comment) throws IllegalAccessException;
    List<Article> GetAllArticle();
    Article DeleteArticle(Long id);
    Article UpdateArticle(Long id, Article upArticle);
}
package com.example.Blog_Management.repositories;


import com.example.Blog_Management.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}

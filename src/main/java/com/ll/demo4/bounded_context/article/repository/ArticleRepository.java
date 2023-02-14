package com.ll.demo4.bounded_context.article.repository;

import com.ll.demo4.bounded_context.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository  extends JpaRepository<Article, Integer> {
}

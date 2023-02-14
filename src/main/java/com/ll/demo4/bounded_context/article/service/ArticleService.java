package com.ll.demo4.bounded_context.article.service;

import com.ll.demo4.bounded_context.article.entity.Article;
import com.ll.demo4.bounded_context.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional
    public void save(Article article) {
        articleRepository.save(article);
    }

    public List<Article> getAll() {
        return articleRepository.findAll();
    }
}

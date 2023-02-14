package com.ll.demo4.bounded_context.article.controller;

import com.ll.demo4.bounded_context.article.entity.Article;
import com.ll.demo4.bounded_context.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    @ResponseBody
    public List<Article> getArticles() {
        Article article = Article
                .builder()
                .author("작성자")
                .title("제목")
                .content("내용")
                .build();

        articleService.save(article);

        return articleService.getAll();
    }
}

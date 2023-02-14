package com.ll.demo4.bounded_context.article.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Article {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String author;
}

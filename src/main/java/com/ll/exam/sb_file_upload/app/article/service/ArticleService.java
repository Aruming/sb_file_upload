package com.ll.exam.sb_file_upload.app.article.service;

import com.ll.exam.sb_file_upload.app.article.entity.Article;
import com.ll.exam.sb_file_upload.app.article.repository.ArticleRepository;
import com.ll.exam.sb_file_upload.app.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public Article write(Long authorId, String subject, String content) {
        Article article = Article
                .builder()
                .author(new Member(authorId))
                .subject(subject)
                .content(content)
                .build();

        articleRepository.save(article);

        return article;
    }
}

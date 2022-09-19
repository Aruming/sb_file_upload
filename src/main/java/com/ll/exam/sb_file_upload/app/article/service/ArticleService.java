package com.ll.exam.sb_file_upload.app.article.service;

import com.ll.exam.sb_file_upload.app.article.entity.Article;
import com.ll.exam.sb_file_upload.app.article.repository.ArticleRepository;
import com.ll.exam.sb_file_upload.app.fileUpload.service.GenFileService;
import com.ll.exam.sb_file_upload.app.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final GenFileService genFileService;

    public Article write(Long authorId, String subject, String content) {
        return write(new Member(authorId), subject, content);
    }

    public Article write(Member author, String subject, String content) {
        Article article = Article
                .builder()
                .author(author)
                .subject(subject)
                .content(content)
                .build();

        articleRepository.save(article);

        return article;
    }

    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    public void addGenFileByUrl(Article article, String typeCode, String type2Code, int fileNo, String url) {
        genFileService.addGenFileByUrl("article", article.getId(), typeCode, type2Code, fileNo, url);
    }
}

package com.ll.exam.sb_file_upload.app.article.repository;

import com.ll.exam.sb_file_upload.app.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}

package com.ll.exam.sb_file_upload.app.article.repository;

import com.ll.exam.sb_file_upload.app.article.entity.Article;

import java.util.List;

public interface ArticleRepositoryCustom {
    List<Article> getQslArticlesOrderByIdDesc();
}

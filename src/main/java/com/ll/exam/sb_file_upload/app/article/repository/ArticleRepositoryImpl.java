package com.ll.exam.sb_file_upload.app.article.repository;

import com.ll.exam.sb_file_upload.app.article.entity.Article;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.ll.exam.sb_file_upload.app.article.entity.QArticle.article;

@RequiredArgsConstructor
public class ArticleRepositoryImpl implements ArticleRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Article> getQslArticlesOrderByIdDesc() {
        return jpaQueryFactory
                .select(article)
                .from(article)
                .orderBy(article.id.desc())
                .fetch();
    }
}

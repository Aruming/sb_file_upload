package com.ll.exam.sb_file_upload.app.hashTag.entity;

import com.ll.exam.sb_file_upload.app.article.entity.Article;
import com.ll.exam.sb_file_upload.app.base.entity.BaseEntity;
import com.ll.exam.sb_file_upload.app.keyword.entity.Keyword;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class HashTag extends BaseEntity {
    @ManyToOne
    @ToString.Exclude
    private Article article;
    @ManyToOne
    @ToString.Exclude
    private Keyword keyword;
}
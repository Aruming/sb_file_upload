package com.ll.exam.sb_file_upload.app.keyword.repository;

import com.ll.exam.sb_file_upload.app.keyword.entity.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KeywordRepository extends JpaRepository<Keyword, Long> {
    Optional<Keyword> findByContent(String keywordContent);
}

package com.ll.exam.sb_file_upload.app.fileUpload.repository;

import com.ll.exam.sb_file_upload.app.fileUpload.entity.GenFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenFileRepository extends JpaRepository<GenFile, Long> {
    List<GenFile> findByRelTypeCodeAndRelId(String relTypeCode, Long relId);
}

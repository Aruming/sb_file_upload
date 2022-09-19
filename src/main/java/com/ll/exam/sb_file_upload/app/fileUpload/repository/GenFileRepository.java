package com.ll.exam.sb_file_upload.app.fileUpload.repository;

import com.ll.exam.sb_file_upload.app.fileUpload.entity.GenFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenFileRepository extends JpaRepository<GenFile, Long> {
}

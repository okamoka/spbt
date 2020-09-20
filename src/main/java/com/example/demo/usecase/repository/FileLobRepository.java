package com.example.demo.usecase.repository;

import com.example.demo.domain.jpasample.FileLob;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileLobRepository extends JpaRepository<FileLob, Long> {
    
    Iterable<FileLob> findByTid(Long tid); 
}

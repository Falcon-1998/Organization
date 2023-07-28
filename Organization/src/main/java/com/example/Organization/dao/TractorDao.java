package com.example.Organization.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Organization.entities.MpTractor;

public interface TractorDao extends JpaRepository<MpTractor, Long>{

}

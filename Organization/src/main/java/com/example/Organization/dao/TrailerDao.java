package com.example.Organization.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Organization.entities.MpTrailer;

public interface TrailerDao extends JpaRepository<MpTrailer, Long> {

}

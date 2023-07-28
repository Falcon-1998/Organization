package com.example.Organization.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Organization.entities.MpUser ;
@Repository
public interface UserDao extends JpaRepository<MpUser, Long> {

}

package com.example.Organization.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Organization.entities.*;
public interface OrgDao extends JpaRepository<MpOrganization, Long> {
   
}

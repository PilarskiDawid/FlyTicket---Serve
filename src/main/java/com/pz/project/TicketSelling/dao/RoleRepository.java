package com.pz.project.TicketSelling.dao;

import java.util.Optional;

import com.pz.project.TicketSelling.entity.RoleName;
import com.pz.project.TicketSelling.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
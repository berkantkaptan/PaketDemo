package com.example.PaketDemo.Admin;

import com.example.PaketDemo.User.DB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<DB,Integer> {
}

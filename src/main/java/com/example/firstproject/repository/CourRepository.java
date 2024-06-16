package com.example.firstproject.repository;

import com.example.firstproject.entities.Abonnement;
import com.example.firstproject.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourRepository extends JpaRepository<Cours, Long> {
}

package com.example.firstproject.repository;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}

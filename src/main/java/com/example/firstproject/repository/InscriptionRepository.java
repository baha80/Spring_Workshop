package com.example.firstproject.repository;

import com.example.firstproject.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
//architecture on couche
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}

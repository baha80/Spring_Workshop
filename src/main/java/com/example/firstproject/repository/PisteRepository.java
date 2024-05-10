package com.example.firstproject.repository;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}

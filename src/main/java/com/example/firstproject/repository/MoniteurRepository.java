package com.example.firstproject.repository;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.entities.Moniteur;
import org.hibernate.mapping.Selectable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {


}

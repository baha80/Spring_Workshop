package com.example.firstproject.repository;

import com.example.firstproject.entities.Abonnement;
import com.example.firstproject.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {

    public List<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);// find by type d'abonnement

    public List<Abonnement> findByDateDebutBetween(LocalDate date1 , LocalDate date2);// find by date de debut
}

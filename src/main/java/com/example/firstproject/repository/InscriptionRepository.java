package com.example.firstproject.repository;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.entities.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//architecture on couche

//inscri --> cours --> Moniteur ( diagramme de classe ) @Query
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

    //explain the query in the next line
////ToBeChecked
@Query("Select  i.numSemaine from Inscription i " + // select the numSemaine from the table Inscription
        "JOIN Moniteur m " + // join the table Moniteur
        "ON i.cours member of m.coursSet " + // on the cours of the moniteur
        "where m.numMoniteur =:numMoniteur And i.cours.support =:support ") // where the numMoniteur is equal to the numMoniteur and the support is equal to the support
//JPQL (Java Persistence Query Language)
public List<Integer> numWeeksCourseOfInstructorBySupport(@Param("numMoniteur") Long numMoniteur, @Param("support")Support support);








}

package com.example.firstproject.services;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.entities.Support;

import java.util.List;

public interface IInscription {

    public Inscription addInscription(Inscription sk);
    public Inscription updateInscription(Inscription sk);
    public List<Inscription> getAllInscription();
    public Inscription getInById(Long numsk);
    public void deleteInscription(Long numsk);

    public Inscription addInscriAndAssignToSkieur(Inscription inscription, long numSkieur);

    public Inscription addInscriAndAssignToCour(Inscription inscription, long numCour);

    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor,Support support);


}




package com.example.firstproject.services;

import com.example.firstproject.entities.Inscription;

import java.util.List;

public interface IInscription {


    public Inscription addInscription(Inscription sk);
    public Inscription updateInscription(Inscription sk);
    public List<Inscription> getAllInscription();
    public Inscription getInById(Long numsk);
    public void deleteInscription(Long numsk);

}



package com.example.firstproject.services;


import com.example.firstproject.entities.Moniteur;

import java.util.List;

public interface IMoniteur {


    public Moniteur addMoniteur(Moniteur sk);
    public Moniteur updateMoniteur(Moniteur sk);
    public List<Moniteur> getAllMoniteur();
    public Moniteur getMoniteurById(Long numsk);
    public void deleteMoniteur(Long numsk);
}

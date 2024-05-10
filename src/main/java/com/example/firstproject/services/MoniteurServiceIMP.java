package com.example.firstproject.services;

import com.example.firstproject.entities.Moniteur;
import com.example.firstproject.repository.MoniteurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MoniteurServiceIMP implements IMoniteur{

    private MoniteurRepository moniteurRepository;


    @Override
    public Moniteur addMoniteur(Moniteur sk) {
        return moniteurRepository.save(sk);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur sk) {
        return moniteurRepository.save(sk);
    }

    @Override
    public List<Moniteur> getAllMoniteur() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur getMoniteurById(Long numsk) {
        return moniteurRepository.findById(numsk).get();
    }

    @Override
    public void deleteMoniteur(Long numsk) {
        moniteurRepository.deleteById(numsk);
    }
}

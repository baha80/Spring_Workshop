package com.example.firstproject.services;

import com.example.firstproject.entities.Inscription;
import com.example.firstproject.repository.InscriptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InscriptionServiceIMP implements IInscription{
private InscriptionRepository inscriptionRepository;
    @Override
    public Inscription addInscription(Inscription sk) {
        return inscriptionRepository.save(sk);
    }

    @Override
    public Inscription updateInscription(Inscription sk) {
        return inscriptionRepository.save(sk);
    }

    @Override
    public List<Inscription> getAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription getInById(Long numsk) {
        return inscriptionRepository.findById(numsk).get();
    }

    @Override
    public void deleteInscription(Long numsk) {
        inscriptionRepository.deleteById(numsk);

    }
}

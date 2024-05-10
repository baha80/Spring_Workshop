package com.example.firstproject.services;

import com.example.firstproject.entities.Piste;
import com.example.firstproject.repository.PisteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PisteServiceIMP implements IPiste{

    private PisteRepository pisteRepository;

    @Override
    public Piste addPiste(Piste sk) {
        return pisteRepository.save(sk);
    }

    @Override
    public Piste updatePiste(Piste sk) {
        return pisteRepository.save(sk);
    }

    @Override
    public List<Piste> getAllPiste() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste getPisteById(Long numsk) {
        return pisteRepository.findById(numsk).get();
    }

    @Override
    public void deletePiste(Long numsk) {
        pisteRepository.deleteById(numsk);

    }
}

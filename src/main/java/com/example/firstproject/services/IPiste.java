package com.example.firstproject.services;

import com.example.firstproject.entities.Piste;

import java.util.List;

public interface IPiste {


        public Piste addPiste(Piste sk);
        public Piste updatePiste(Piste sk);
        public List<Piste> getAllPiste();
        public Piste getPisteById(Long numsk);
        public void deletePiste(Long numsk);


}

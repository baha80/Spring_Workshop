package com.example.firstproject.services;

import com.example.firstproject.entities.Skieur;
import com.example.firstproject.repository.SkieurRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
//@Autowired // injection par champs
@Service  // @Service annotation is used with classes that provide some business functionalities.
public class SkieurServiceIMP implements ISkieur{

    private SkieurRepository skieurRepository; //service d'implementation depend de la couche repository



    @Override
    public Skieur addSkieur(Skieur sk) {
       return skieurRepository.save(sk); //save() method saves an entity to the database
    }

    @Override
    public Skieur updateSkieur(Skieur sk) {
        return skieurRepository.save(sk);// save()
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skieurRepository.findAll(); //findAll() method returns all entities from the database.
    }

    @Override
    public Skieur getSkById(Long numsk) {
        //return skieurRepository.findById(numsk).get(); //findById() method finds an entity by its primary key.
        //.get() method returns the value of this Optional if present, otherwise throws NoSuchElementException.
        return skieurRepository.findById(numsk).orElse(null);
    }

    @Override
    public void deleteSkieur(Long numsk) {
        skieurRepository.deleteById(numsk); //deleteById() method deletes an entity by its primary key.

    }
}

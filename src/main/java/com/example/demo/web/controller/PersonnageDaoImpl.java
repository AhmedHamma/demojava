package com.example.demo.web.controller;

import com.example.demo.Personnage;
import com.example.demo.web.controller.dao.PersonnageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface PersonnageDaoImpl  extends JpaRepository<Personnage, Integer> {
    List<Personnage> findAll();
    Optional<Personnage> findById(Integer id);
    Personnage save(Personnage personnage);
    void deleteById(Integer id);
}
//public class PersonnageDaoImpl implements PersonnageDao {
//    public static List<Personnage> personnages = new ArrayList<>();
//
//    static {
//        personnages.add(new Personnage(1, "Titouan", "Valise", 100));
//        personnages.add(new Personnage(2, "Pef", "bg", 29));
//        personnages.add(new Personnage(3, "Tristan", "Memes", 42));
//        personnages.add(new Personnage(4, "Valentin", "Bg brillant", 9001));
//    }
//
//    @Override
//    public List<Personnage> findAll() {
//        return personnages;
//    }
//
//    @Override
//    public Personnage findById(int id) {
//        for (Personnage personnage : personnages) {
//            if(personnage.getId() ==id){
//                return personnage;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Personnage save(Personnage personnage) {
//        personnages.add(personnage);
//        return personnage;
//    }
//
//    @Override
//    public Personnage deleteById(int id){
//        personnages.remove(this.findById(id));
//    return null;
//    }
//
//    @Override
//
//    public boolean updatePersonnage(Personnage personnage) {
//        Optional<Personnage> found_personnage = PersonnageDaoImpl.personnages.stream()
//                .filter(c -> c.getId() == personnage.getId())
//                .findFirst();
//        if (found_personnage.isPresent()) {
//            Personnage personnage1 = found_personnage.get();
//            personnage1.setNom(personnage.getNom());
//            personnage1.setType(personnage.getType());
//            personnage1.setPdv(personnage.getPdv());
//            return true;
//        }
//
//
//        return false;
//    }
//}

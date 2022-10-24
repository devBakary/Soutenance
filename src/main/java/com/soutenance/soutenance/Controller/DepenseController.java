package com.soutenance.soutenance.Controller;

import com.soutenance.soutenance.Modele.Depense;
import com.soutenance.soutenance.Service.DepenseService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/depense")
public class DepenseController {

    @Autowired
    final private DepenseService depenseService;

    @PostMapping("/creer")
    public Depense creerdepense(@RequestBody Depense depense) {
        return depenseService.creerdepense(depense);
    }

    @GetMapping("/afficher")
    public List<Depense> afficherdepenses(){
        return depenseService.afficherdepenses();
    }

    @PutMapping("/modifier/{id}")
    public Depense modifier(@RequestBody Depense depense, @PathVariable Long id){
        return depenseService.modifier(depense, id);
    }

}

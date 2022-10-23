package com.soutenance.soutenance.Controller;
import com.soutenance.soutenance.Modele.Salarie;
import com.soutenance.soutenance.Service.salarieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/salarie")
public class salarieController {

    @Autowired
    private com.soutenance.soutenance.Service.salarieService salarieService;

    @PostMapping("/creer")
    public Salarie creersalarie(@RequestBody Salarie salarie){
        return salarieService.creersalarie(salarie);
    }

    @GetMapping("/afficher")
    public List<Salarie> listeSalarie(){
        return salarieService.listeSalarie();
    }
    @GetMapping("/salarieparId/{id}")
    public List<Salarie> trouversalarieParId(@PathVariable Long id){
        return salarieService.trouversalarieParId(id);
    }

    @PutMapping("/modifier/{id}")
    public Salarie modifierSalarie(@RequestBody Salarie salarie, @PathVariable Long id){
        return salarieService.modifierSalarie(salarie, id);
    }

}

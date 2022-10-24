package com.soutenance.soutenance.Controller;

import com.soutenance.soutenance.Modele.Dette;
import com.soutenance.soutenance.Service.DetteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/dette")
public class DetteController {


    @Autowired
    private DetteService detteService;

    @PostMapping("/creer")
    public Dette creer(@RequestBody Dette dette) {
        return detteService.creer(dette);
    }

    @GetMapping("/liste")
    public List<Dette> afficherListe() {
       return detteService.afficherListe();
    }


    @PutMapping("/modifier/{id}")
    public Dette modifier(@RequestBody Dette dette, @PathVariable Long id) {
        return detteService.modifier(dette, id);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(Long id) {
        if(id != null){
            detteService.supprimer(id);
        }else{
            return ;
        }

    }
}

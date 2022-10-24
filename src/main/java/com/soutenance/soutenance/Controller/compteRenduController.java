package com.soutenance.soutenance.Controller;

import com.soutenance.soutenance.Modele.CompteRendu;
import com.soutenance.soutenance.Service.compteRenduService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/compterendu")
public class compteRenduController {

  @Autowired
    private com.soutenance.soutenance.Service.compteRenduService compteRenduService;

  @PostMapping("/creer")
    public CompteRendu creerRendu(@RequestBody CompteRendu compteRendu){

    return compteRenduService.creerRendu(compteRendu);
  }

  @PutMapping("/afficher")
  public List<CompteRendu> afficherCR(){
    return compteRenduService.afficherCR();
  }
}

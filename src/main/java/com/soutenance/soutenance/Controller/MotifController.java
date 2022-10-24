package com.soutenance.soutenance.Controller;

import com.soutenance.soutenance.Modele.Motif;
import com.soutenance.soutenance.Service.MotifService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/motif")
public class MotifController {

    @Autowired
    private MotifService motifService;

    @PostMapping("/creer")
    public Motif creer(@RequestBody Motif motif){
        return motifService.creer(motif);
    }
}

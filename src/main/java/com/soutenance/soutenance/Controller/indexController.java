package com.soutenance.soutenance.Controller;

import com.soutenance.soutenance.Modele.NumeroIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/index")
public class indexController {

    @Autowired
    private com.soutenance.soutenance.Service.indexService indexService;

    @PostMapping("/creer")
    public NumeroIndex creerindex(@RequestBody NumeroIndex index){

        return indexService.creerindex(index);
    }

    @GetMapping("/afficherId")
    public List<NumeroIndex> afficherIndexId(@PathVariable Long id){
       return indexService.afficherIndexId(id);
    }

    @GetMapping("/afficher")
    public List<NumeroIndex> afficherIndex(){
        return indexService.afficherIndex();
    }

    @PutMapping("/modifier/{id}")
    public NumeroIndex modifierindex(@RequestBody NumeroIndex index, @PathVariable Long id){
        return indexService.modifierindex(index, id);
    }

}

package com.soutenance.soutenance.Controller;

import com.soutenance.soutenance.Modele.Index;
import com.soutenance.soutenance.Service.indexService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/index")
public class indexController {

    private com.soutenance.soutenance.Service.indexService indexService;

    @PostMapping("/creer")
    public Index creerindex(@RequestBody Index index){
        return indexService.creerindex(index);
    }

    @GetMapping("/afficherId")
    public List<Index> afficherIndexId(@PathVariable Long id){
       return indexService.afficherIndexId(id);
    }

    @GetMapping("/afficher")
    public List<Index> afficherIndex(){
        return indexService.afficherIndex();
    }

    @PutMapping("/modifier/{id}")
    public Index modifierindex(@RequestBody Index index, @PathVariable Long id){
        return indexService.modifierindex(index, id);
    }

}

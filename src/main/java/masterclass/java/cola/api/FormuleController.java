package masterclass.java.cola.api;

import masterclass.java.cola.restaurant.Formule;
import masterclass.java.cola.restaurant.Plat;
import masterclass.java.cola.restaurant.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/formule")
public class FormuleController {

    Formule bestOf = new Formule("best Of", List.of(
            new Plat("big mac", 5.0, List.of()),
            new Plat("petite frite", 5.0, List.of())
    ));
    Formule maxiBestOf = new Formule("maxi best Of", List.of());
    Formule petiteFaim = new Formule("petite faim", List.of());
    List<Formule> carte = List.of(bestOf, maxiBestOf, petiteFaim);


    private RestaurantService service;

    public FormuleController(RestaurantService service) {
        this.service = service;
    }

    @GetMapping
    List<Formule> getFormules(){
        return carte;
    }

    @GetMapping("/prix")
    Double getPrixBestOf(){
        return service.calculerPrixFormule(bestOf);
    }

}

package edu.escuelaing.arsw.tallertablerointeractivo;


import org.springframework.web.bind.annotation.*;

@RestController
public class PointsController {
   private PointsCache points = PointsCache.getInstance();
    @PostMapping("/points")
    public String proccesPoints(@RequestBody String points){
        System.out.println("payload:"+ points);
        return points;
    }
}

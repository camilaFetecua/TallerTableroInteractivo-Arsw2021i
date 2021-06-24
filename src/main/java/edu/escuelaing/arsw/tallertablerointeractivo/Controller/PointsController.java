package edu.escuelaing.arsw.tallertablerointeractivo.Controller;


import edu.escuelaing.arsw.tallertablerointeractivo.PointsCache;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class PointsController {
    @Resource
    private HttpServletRequest request;
    private PointsCache points = PointsCache.getInstance();


    @PostMapping("/points")
    public String proccesPoints(@RequestBody String points){
        System.out.println("payload:"+ points);
        return points;
    }

    @GetMapping("/setname")
    public String setName(@RequestParam(value = "name", defaultValue =
            "Anónimo") String name) {
        request.getSession().setAttribute("name", name);
        return String.format("Hello %s!", name);
    }
}

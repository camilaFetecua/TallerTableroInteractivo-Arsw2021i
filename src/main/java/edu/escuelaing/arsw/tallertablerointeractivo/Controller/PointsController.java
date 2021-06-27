package edu.escuelaing.arsw.tallertablerointeractivo.Controller;


import com.google.gson.Gson;
import edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point;
import edu.escuelaing.arsw.tallertablerointeractivo.Cache.PointsCache;
import edu.escuelaing.arsw.tallertablerointeractivo.Entities.Usuario;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.util.Map;

@RestController
public class PointsController {
    @Resource
    private HttpServletRequest request;
    private PointsCache points = PointsCache.getInstance();



    @PostMapping("/points")
    public String proccesPoints(@RequestBody String points){
        Gson gson = new Gson();
        Map map = gson.fromJson(points, Map.class);
        System.out.println("payload:"+ map.get("color"));
        System.out.println("payload:"+ map.get("pointsarr"));
        return points;
    }
    @GetMapping("/setNombre")
    public String name(@RequestParam(value = "name", defaultValue = "World") String name){
        request.getSession().setAttribute("name", name);
        Usuario usuario = new Usuario(name);
        PointsCache.getInstance().agregarUsuario(usuario);
        return String.format("Hello %s!", name);
    }

    @GetMapping("/setPointarray")
    public void addPoints(@RequestBody Point point){
        PointsCache.getInstance().agregarPoint(point);
    }

    @GetMapping("/getUsuarioColor")
    public Color getUserColor(){
        String name = (String) request.getSession().getAttribute("name");
        return (Color) PointsCache.getInstance().getUsuarioColor(name);
    }
}

package edu.escuelaing.arsw.tallertablerointeractivo.Cache;

import edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point;
import edu.escuelaing.arsw.tallertablerointeractivo.Entities.Usuario;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PointsCache {
    private  static PointsCache _instance = new PointsCache();

    private List<edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point> pointList= new ArrayList<edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point>();
    private List<Usuario> usuarioList= new ArrayList<Usuario>();
    public  static final  PointsCache instance = new PointsCache();

    private PointsCache PointsCache(){
        return instance;
    }

    public  static PointsCache getInstance(){
        return instance;
    }
    public void agregarUsuario(Usuario usuario){
        usuarioList.add(usuario);
    }

    public void agregarPoint(edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point point) {
        if (!pointList.contains(point)) {
            pointList.add(point);
        }
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }
    public Object getUsuarioColor(String name){
        for(Usuario usuario: usuarioList){
            if(usuario.getNombre().equals(name)){
                return usuario.getColor();
            }
        }
        return new Color(0,0,0);
    }
}



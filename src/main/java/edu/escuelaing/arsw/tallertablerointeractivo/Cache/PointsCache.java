package edu.escuelaing.arsw.tallertablerointeractivo.Cache;

import edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point;
import edu.escuelaing.arsw.tallertablerointeractivo.Entities.Usuario;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Es la clase en la cual se obtiene los graficos dibujados por cada uno de los usuarios y el registro de estos.
 */
public class PointsCache {
    private  static PointsCache _instance = new PointsCache();

    private List<edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point> pointList= new ArrayList<edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point>();
    private List<Usuario> usuarioList= new ArrayList<Usuario>();
    public  static final  PointsCache instance = new PointsCache();

    /**
     * Metodo constructor
     * @return intance
     */
    private PointsCache PointsCache(){
        return instance;
    }

    /**
     * Metodo que trae la instancia
     * @return intancia
     */
    public  static PointsCache getInstance(){
        return instance;
    }

    /**
     * Metodo que agraga un uaurio al la lista de estos
     * @param usuario de la clase usuario
     */
    public void agregarUsuario(Usuario usuario){
        usuarioList.add(usuario);
    }

    /**
     * Metodo que agrega un punto a la lista de estoa
     * @param point de la lase point
     */
    public void agregarPoint(edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point point) {
        if (!pointList.contains(point)) {
            pointList.add(point);
        }
    }

    /**
     * Metodo que obtiene la lista de usuarios
     * @return la lista de usuarios
     */
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    /**
     * Metodo que coloca los usuarios de ls lista
     * @param usuarioList de esta clase
     */
    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<edu.escuelaing.arsw.tallertablerointeractivo.Entities.Point> getPointList() {
        return pointList;
    }

    /**
     * Metodo que coloca los puntos de la lista
     * @param pointList de esta clase
     */
    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    /**
     * Metodo que obtiene el Color del usuario
     * @param name de la clase usuario
     * @return el  color del usuario
     */
    public Object getUsuarioColor(String name){
        for(Usuario usuario: usuarioList){
            if(usuario.getNombre().equals(name)){
                return usuario.getColor();
            }
        }
        return new Color(0,0,0);
    }
}



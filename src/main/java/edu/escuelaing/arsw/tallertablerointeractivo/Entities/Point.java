package edu.escuelaing.arsw.tallertablerointeractivo.Entities;

import com.google.gson.Gson;

import java.util.Map;
import java.util.Properties;

/**
 * Clase con la cual se obtiene las coordenasdas especificas y el color de cada punto-
 */
public class Point {
    private Integer[] pointarray= new Integer[2];
    private Integer[] color= new Integer[3];

    /**
     * metodo constructor
     */
    public Point(){
    }

    /**
     * Obtiene el array del punto
     * @return aray del punto
     */
    public Integer[] getPointarray() {
        return pointarray;
    }

    /**
     * Metodo que asigna pointaraay al arreglo
     * @param pointarray
     */
    public void setPointarray(Integer[] pointarray) {
        this.pointarray = pointarray;
    }
    /**
     * Obtiene el color del punto
     * @return aray del punto
     */
    public Integer[] getColor() {
        return color;
    }

    /**
     * Metodo que asigna el color
     * @param color
     */
    public void setColor(Integer[] color) {
        this.color = color;
    }
}

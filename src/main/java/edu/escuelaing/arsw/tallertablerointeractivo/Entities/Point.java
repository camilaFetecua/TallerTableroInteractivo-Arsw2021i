package edu.escuelaing.arsw.tallertablerointeractivo.Entities;

import com.google.gson.Gson;

import java.util.Map;
import java.util.Properties;

public class Point {
    private Integer[] pointarray= new Integer[2];
    private Integer[] color= new Integer[3];


    public Point(){
    }

    public Integer[] getPointarray() {
        return pointarray;
    }

    public void setPointarray(Integer[] pointarray) {
        this.pointarray = pointarray;
    }

    public Integer[] getColor() {
        return color;
    }

    public void setColor(Integer[] color) {
        this.color = color;
    }
}

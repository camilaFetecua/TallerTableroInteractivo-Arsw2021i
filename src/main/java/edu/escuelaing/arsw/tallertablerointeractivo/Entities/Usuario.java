package edu.escuelaing.arsw.tallertablerointeractivo.Entities;

public class Usuario {
    private String name;
    private Integer[] color= new Integer[3];

    public Usuario(String name){
        this.name=name;
        color[0]= (int)Math.random()*256;
        color[1]= (int)Math.random()*256;
        color[2]= (int)Math.random()*256;
    }

    public void setColor(Integer[] color) {
        this.color = color;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getNombre() {
        return name;
    }

    public Integer[] getColor() {
        return color;
    }

}

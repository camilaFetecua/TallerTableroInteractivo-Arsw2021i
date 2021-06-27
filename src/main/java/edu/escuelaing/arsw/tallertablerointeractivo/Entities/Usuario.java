package edu.escuelaing.arsw.tallertablerointeractivo.Entities;


/**
 * Clase en la cual se obtienen los datos como el nombre y el color de cada uno de los usuarios.
 */
public class Usuario {
    private String name;
    private Integer[] color= new Integer[3];

    public Usuario(String name){
        this.name=name;
        color[0]= (int)Math.random()*256;
        color[1]= (int)Math.random()*256;
        color[2]= (int)Math.random()*256;
    }

    /**
     * Asigna el color al arreglo
     * @param color
     */

    public void setColor(Integer[] color) {
        this.color = color;
    }

    /**
     * Asigna el nombre a la  variable
     * @param name
     */
    public void setNombre(String name) {
        this.name = name;
    }

    /**
     * obtiene el nombre del usuario
     * @return name
     */
    public String getNombre() {
        return name;
    }

    /**
     * Obtiene el color
     * @return
     */
    public Integer[] getColor() {
        return color;
    }

}

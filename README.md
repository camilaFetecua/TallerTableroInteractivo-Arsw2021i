# Taller Tablero Interactivo

## Taller ARSW 2021-i / 28 Junio del 2021

  El objetivo de este taller es el desarrollo de un tablero interactivo
  que permita a múltiples usuarios dibujar en un tablero compartido.El tablero 
  debe permitir a múltiples usuarios dibujar en línea y proveer un botón de
  borrado. Cada persona debe iniciar con un color diferente. Cuándo 
  alguien oprime el botón de borrar el tablero se borra para todas las personas.

  
# Prerrequisitos 
  + Git version 2.25.1
  + Apavhe Maven version 4.0.0
  + Java version 11.0.11
  
  Para verificar que esten instalados los programas puede usar los suguientes comandos
    + mvn --version
    + git version
    +java --version
       
# Ejecucion del proyecto

  Para empezar debemos clonar el repositorio con el siguiente comando:

     git clone https://github.com/camilaFetecua/TallerTableroInteractivo-Arsw2021i.git
  
   Para ejecutar el proyecto  desde git ejecutar el siguiente comando  

    mvn package
  
  Y despues de ejecutar el comando anterior se debe ejecutar el siguiente comando
  
  java -cp "target/classes;target/dependency/*" edu.escuelaing.arsw.tallertablerointeractivo
  
      
# Diagrama de clases  

![Imagen](https://github.com/camilaFetecua/TallerTableroInteractivo-Arsw2021i/blob/master/Imagenes/Diagrama%20de%20clases.PNG)

  Para este taller utilizamos 5 clases 
  
   + TallerTableroInteractivoApplication: Es la clase principal donde se ejcuta el programa y esta el main. 
   + PointsController:Es la clase que controle el manejo de peticiones que se obtienen en la pagina. 
   + PointsCache: Es la clase en la cual se obtiene los graficos      dibujados por cada uno de los usuarios y el registro de estos.
   + Usuario: Clase en la cual se obtienen los datos como el nombre y el color de cada uno de los usuarios.
   + Point: Clase con la cual se obtiene las coordenasdas especificas y el color de cada punto-
  
 # Pruebas 
 
 Para pruebas usamos la aplicacion que esta en el siguiente link 
 
    https://tablero-interactivo-arsw.herokuapp.com/
    
 
 Ingresamos el nombre del primer usuario y le damos registrar 
 
  ![Imagen](https://github.com/camilaFetecua/TallerTableroInteractivo-Arsw2021i/blob/master/Imagenes/Prueba1.PNG)
  
  Y empezamos a realizar el dubujo y nos aparece los puntos de un color especifico 
  
  ![Imagen](https://github.com/camilaFetecua/TallerTableroInteractivo-Arsw2021i/blob/master/Imagenes/Prueba2.PNG)
  
  En otra ventana del navegador abrimos el mismo link y registramos otro usuario y podemos ver como inica los puntos de un color diferente. 
  
 ![Imagen](https://github.com/camilaFetecua/TallerTableroInteractivo-Arsw2021i/blob/master/Imagenes/Prueba3.PNG)
 
Al lado derecho del boton de regitrar , queda el boton de borrar cuando le hacemos clic podemos observar que se borra el contenido de la pantalla. 

![Imagen](https://github.com/camilaFetecua/TallerTableroInteractivo-Arsw2021i/blob/master/Imagenes/Prueba4.PNG)

  
 

# Licencia

  Para consultar la Licencia del proyecto haga [click aqui](https://github.com/camilaFetecua/TallerTableroInteractivo-Arsw2021i/blob/master/LICENSE.md)
  
  
# Autor 
  **Maria Camila Fetecua Garcia**  LOCS/HORA 180/10= 18 LOCS/Hora 


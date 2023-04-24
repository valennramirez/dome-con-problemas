package Elemento;

public class Elemento {
    private String nombre;
    private String idioma;
    private String comentario;
    private String genero;
    private String clasificacion;
    private float duracion;
    private int anio;
    private float puntuacion;

   // private Elemento[] dvds;



    public Elemento() {
        nombre = "";
        genero = "";
        clasificacion = "";
        idioma = "";
        comentario = "";
        duracion = 0;
        anio = 0;
        puntuacion = 0;

        //dvds= new DVD[20];

    }

    public Elemento(String nombre, String genero, String clasificacion, String idioma, String comentario, float duracion, int anio, float puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.idioma = idioma;
        this.comentario = comentario;
        this.duracion = duracion;
        this.anio = anio;
        this.puntuacion = puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getClasificacion() {
        return clasificacion;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public float getPuntuacion() {
        return puntuacion;
    }


    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Genero: " + genero + "\n" +
                "Año: " + anio + "\n" +
                "Duracion: " + duracion + "\n" +
                "Idioma: " + idioma + "\n" +
                "Puntaje: " + puntuacion + "\n" +
                "Clasificacion: " + clasificacion + "\n" +
                ", Comentario/Reseña: " + comentario;
    }

   /* public void mostrarPorDirectror(String director, int validos) {
        int i = 0;

        while (i < validos) {
            if (dvds[i].getDirector().equals(director)) {

            }

            i++;
        }
    }

    public boolean agregarDVD(DVD nuevoDVD, int validos) {
        if (validos < 20) {
            dvds[validos] = nuevoDVD;
            validos++;
        }
        return true;
    }

    public int buscarDVD_porNombre(String nombre, int validos) {
        int i = 0, flag = 0;

        while (i < validos && flag == 0) {
            if (dvds[i].getNombre().equals(nombre)) {
                flag = i;
            }
            i++;
        }

        return flag;
    }*/



}

package Elemento;

public class CD extends Elemento{

    private String artista;
    private String discografia;
    private int cantCanciones;
    private int precio;
    private int cantReproducciones;
    private CD[] cds;

    public CD (){
        artista="";
        discografia="";
        cantCanciones=0;
        precio=0;
        cantReproducciones=0;

        cds =new CD[20];
    }

    public CD (String artista, String discografia, String nombre, String genero, String comentario, String idioma, String clasificacion, int cantCanciones, int precio, int cantReproducciones, int anio, float duracion, float puntuacion)
    {
        super(nombre, genero, clasificacion, idioma, comentario, duracion, anio, puntuacion);
        this.artista=artista;
        this.discografia=discografia;
        this.cantCanciones=cantCanciones;
        this.precio=precio;
        this.cantReproducciones=cantReproducciones;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista ()
    {
        return artista;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCantReproducciones(int cantReproducciones) {
        this.cantReproducciones = cantReproducciones;
    }

    public int getCantReproducciones() {
        return cantReproducciones;
    }

    //comportamiento

    public String imprimirCD () {
        return "Artista:" + artista + "\n"+
                ", Cantidad de Canciones: " + cantCanciones + "\n" +
                ", Cantidad de reproducciones: " + cantReproducciones;
    }

    public void mostrarPorArtista(String artista, int validos) {
        int i = 0;

        while (i<validos)
        {
            if (artista.equals(cds[i].getArtista())) {
                System.out.println(super.toString());
                System.out.println(cds[i].imprimirCD());
            }
            i++;
        }
    }

    public boolean existeCD(String nombre, int validos) {
        boolean flag = false;

        for (CD cds : cds) //recorre el arreglo
        {
            if (super.getNombre().equals(nombre)) {
                flag = true;
            }
        }

        return flag;
    }

    public int buscarCD_porArtista(String nombre, int validos) {
        int i = 0, flag = 0;

        while (i < validos && flag == 0) {
            if (nombre.equals(cds[i].getArtista())) {
                flag = i;
            }
            i++;
        }

        return flag;
    }
    public boolean agregarCD(CD nuevoCD, int validos) {
        if (validos < 20) {
            cds[validos] = nuevoCD;
            validos++;
        }
        return true;
    }

    public int buscarCD_porNombre(String nombre, int validos) {
        int i = 0, flag = 0;

        while (i < validos && flag == 0) {
            if (super.getNombre().equals(nombre)) {
                flag = i;
            }
            i++;
        }

        return flag;
    }



}

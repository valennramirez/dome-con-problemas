package Elemento;

public class DVD extends Elemento{

    private String director;
    private String distribudora;
    private String estudio;
    private String sipnosis;

    //private String[] subtitulos=new String[10];
    //private String[] idiomas=new String [10];

    ///private DVD[] dvds=new DVD[20];

    public DVD (){
        super();
        director="";
        distribudora="";
        estudio="";
        sipnosis="";
    }

    public DVD (String nombre, String genero, String clasificacion, String idioma, String comentario, float duracion, int anio, float puntuacion, String director, String distibudora, String estudio, String sipnosis)
    {
        super(nombre, genero, clasificacion, idioma, comentario, duracion, anio, puntuacion);
        this.director=director;
        this.distribudora=distribudora;
        this.estudio=estudio;
        this.sipnosis=sipnosis;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDistribudora(String distribudora) {
        this.distribudora = distribudora;
    }

    public String getDistribudora() {
        return distribudora;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public String imprimirDVD ()
    {
        return "Director: " + director + ", Distribuidora: " + distribudora + ", Estudio: " + estudio + ", Sipnosis: "+ sipnosis;
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
            if (super.getNombre().equals(nombre)) {
                flag = i;
            }
            i++;
        }

        return flag;
    }*/

}

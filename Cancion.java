package evf.javadoc.original;


 public class Cancion {
    String nombreCancion;
    Artista artista;

    public Cancion(String nombreCancion, Artista artista) {
        this.nombreCancion = nombreCancion;
        this.artista = artista;
    }


    public void reproducirCancion(){
        System.out.println("Reproduciendo la canción "+nombreCancion);
    }

    public String getNombreCancion() {
        String nombreCancion = "Esa no";
        if(!this.nombreCancion.equals("Sobreviviré"))
            nombreCancion = this.nombreCancion;
        return nombreCancion;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", artista=" + artista +
                '}';
    }
  }


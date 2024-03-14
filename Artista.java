package evf.javadoc.original;

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }
    /*Método que mira si el nombre de la artista es Mónica Naranjo 
      y devuelve un booleano en función del resultado: */
    public boolean esSobrevivire(){
        boolean esSobrevivire = false;
        if(nombreArtista.equals("Mónica Naranjo"))
            esSobrevivire = true;
        return esSobrevivire;
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
    
}



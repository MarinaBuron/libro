
public class Libro {

    private String autor;
    private String titulo;

    public Libro(String autorLibro, String tituloLibro) {
        autor = autorLibro;
        titulo = tituloLibro;
    }
    
    /**
     * Método getter para autor
     */
    public String getAutor(){
        return autor;
    }
    
    /**
     * Método getter para libro
     */
    public String getTitulo(){
        return titulo;
    }
}

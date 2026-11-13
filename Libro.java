
public class Libro {
    //Atributos de la clase Libro
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;

    public Libro(String autorLibro, String tituloLibro, int paginas) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
    }
    
    /**
     * Método getter para autor
     */
    public String getAutor(){
        return autor;
    }
    
    /**
     * Método getter para título
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * Método getter para el número de páginas del libro
     */
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    /**
     * Método getter para los detalles del libro
     */
    public String getDetalles(){
        String detalles = "Título: " + titulo + " | " + "Autor: " + autor + " | " + "Páginas: " + numeroPaginas;      
        return detalles;
    }
    
    /**
     * Método getter para obtener el número referencial del libro
     */
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    /**
     * Método setter para el número referencial del libro
     */
    public void setNumeroReferencia(String numRef){
        if (numRef.length() >= 3){ //length() mide la longitud del String
            numeroReferencia = numRef;
        }else{
            System.out.println("Error al insertar el número de referencia");
        }
        
    }
    
    /**
     * Imprimiendo el nombre del autor
     */
    public void imprimirAutor(){
        System.out.println("El autor del libro es: " + autor);
    }
    
    /**
     * Imprimiendo el título del libro
     */
    public void imprimirTitulo(){
        System.out.println("El título del libro es: " + titulo);
    }
    
    /**
     * Método imprimir los detalles del libro
     */
    public void imprimirDetalles(){
        System.out.println("Título: " + titulo + " | " + "Autor: " + autor + " | " + "Páginas: " + numeroPaginas);
    }
}

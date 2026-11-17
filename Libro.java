
public class Libro {
    //Atributos de la clase Libro
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    public Libro(String autorLibro, String tituloLibro, int paginas, boolean libroTexto) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
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
        String detalles = "Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
        
        if (numeroReferencia.length() > 3){ //Aquí vemos si el número de referencia está configurado
            detalles = detalles + " | NºRef: " + numeroReferencia;
        }else{ 
            detalles = detalles + " | NºRef:--";
        }
        
        detalles = detalles + " | Nºveces prestado: " + vecesPrestado;
        
        if (esLibroDeTexto == true){
            detalles = detalles + " | Libro de texto: Sí";
        }else{
            detalles = detalles + " | Libro de texto: No";
        }
        
        return detalles;
    }
    
    /**
     * Método getter para obtener el número referencial del libro
     */
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    /**
     * Método getter para vecesPrestado
     */
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    /**
     * Método getter para determinar si un libro es libro de texto
     */
    public boolean getLibroDeTexto(){
        return esLibroDeTexto;
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
     * Método para prestar el libro
     */
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
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
        String detalles = "Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
        
        if (numeroReferencia.length() >= 3){
            detalles = detalles + " | NºRef: " + numeroReferencia;
        }else{
            detalles = detalles + " | NºRef:--";
        }
        
        detalles = detalles + " | Nºveces prestado: " + vecesPrestado;
        
        if (esLibroDeTexto == true){
            detalles = detalles + " | Libro de texto: Sí";
        }else{
            detalles = detalles + " | Libro de texto: No";
        }
        
        System.out.println(detalles);
    }
}

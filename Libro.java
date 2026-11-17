/**
 * Representa a un libro con distintas características
 * 
 * @author Marina
 * @version 1.0
 */
public class Libro {
    //Atributos de la clase Libro
    private String autor; //Autor de libro
    private String titulo; //título del libro
    private int numeroPaginas; //Número de páginas del libro
    private String numeroReferencia; //Número de referencia del libro
    private int vecesPrestado; //Las veces que el libro se ha prestado
    private boolean esLibroDeTexto; //Determina si es un libro de texto 

    /**
     * @param autor: determina el autor del libro
     * @param titulo: determina el título del libro
     * @param paginas: determina las páginas del libro
     * @param numeroReferencia: determina el número de referencia
     * @param vecesPrestado: determina las veces que el libro se ha prestado
     * @param esLibroDeTexto: determina si el libro es de texto
     */
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
     * @return el número de páginas asignado
     */
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    /**
     * Método getter para los detalles del libro
     * @return los detalles del libro
     */
    public String getDetalles(){
        String detalles = "Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
        
        if (numeroReferencia.length() > 3){ //Aquí vemos si el número de referencia está configurado
            detalles = detalles + " | NºRef: " + numeroReferencia;
        }else{ 
            detalles = detalles + " | NºRef:--";
        }
        
        detalles = detalles + " | Nºveces prestado: " + vecesPrestado;
        
        if (esLibroDeTexto){
            detalles = detalles + " | Libro de texto: Sí";
        }else{
            detalles = detalles + " | Libro de texto: No";
        }
        
        return detalles;
    }
    
    /**
     * Método getter para obtener el número referencial del libro
     * @return el número de referencia del libro, mayor que 3 caracteres
     */
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    /**
     * Método getter para vecesPrestado
     * @return las veces prestado, puede ser 0 o más
     */
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    /**
     * Método getter para determinar si un libro es libro de texto
     * @return (@code true) si es de texto, (@code false) si no lo es
     */
    public boolean getLibroDeTexto(){
        return esLibroDeTexto;
    }
    
    /**
     * Método setter para el número referencial del libro
     * @param número de referencia a insertar al invocar el método
     * Comprueba si el número de referencia es correcto
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
     * Suma las veces que se ha prestado el libro
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
        
        if (esLibroDeTexto){
            detalles = detalles + " | Libro de texto: Sí";
        }else{
            detalles = detalles + " | Libro de texto: No";
        }
        
        System.out.println(detalles);
    }
}

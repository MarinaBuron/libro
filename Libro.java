
public class Libro {
    //Atributos de la clase Libro
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    public Libro(String autorLibro, String tituloLibro, int paginas) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
        vecesPrestado = 0;
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
        }else if (vecesPrestado > 0){ //Aquí vemos si alguna vez se ha prestado un libro
                detalles = detalles + " | NºRef: " + numeroReferencia + " | NºVeces prestado: " + vecesPrestado;
            }else{
                detalles = detalles + " | NºRef:-- | NºVeces prestado: 0";
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
        boolean prestado = true;
        
        if (prestado == true){
            vecesPrestado = vecesPrestado + 1;
        }else{
            vecesPrestado = 0;
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
        String detalles = "Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
        
        if (numeroReferencia.length() >= 3){
            System.out.println(detalles + " | NºRef: " + numeroReferencia);
        }else if (vecesPrestado > 0){
                System.out.println(detalles + " | NºRef: " + numeroReferencia + " | NºVeces prestado: " + vecesPrestado);
            }else{
                System.out.println(detalles + " | NºRef:--" + "| NºVeces prestado: 0");
        }
    }
}

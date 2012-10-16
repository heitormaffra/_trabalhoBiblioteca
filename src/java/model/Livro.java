
package model;

// classe de modelo de livro

public class Livro {
    private String titulo;
    private String autor;

    public Livro() {
    }

    public Livro( String titulo, String autor) {
        // porque utilizar o super ??
        super();
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}

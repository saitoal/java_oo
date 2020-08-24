public class Biblioteca{
    private String  titulo;
    private String  autor;
    private int     ano;
    private String  categoria;
    private double  plateleira;
    private double  estante;
    private boolean emprestado;
    
    String getTitulo(){
        return titulo;
    }
    void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }
    String getAutor(){
        return autor;
    }
    void setAutor(String novoAutor){
        autor = novoAutor;
    } 
    int getAno(){
        return ano;
    }
    void setAno(int novoAno){
        ano = novoAno;
    }
    String getCategoria(){
        return categoria;
    }
    void setCategoria(String novoCategoria){
        categoria = novoCategoria;
    }
        double getPlateleira(){
        return plateleira;
    }
    void setPlateleira(double novoPlateleira){
        plateleira = novoPlateleira;
    }
    double getEstante(){
        return estante;
    }
    void setEstante(double novoEstante){
        estante = novoEstante;
    }
    boolean isEmprestado(){
        return emprestado;
    }
    void setemprestado(boolean novoEmprestado){
        emprestado = novoEmprestado;
    }
}
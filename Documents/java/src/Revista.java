public class Revista extends item {

    private int volume;
    private int anopublicacao;
    private String nomeeditora;
    private String principaisassuntos;

    public Revista(String nomeeditora,int anopublicacao, int volume,String nome,String data,String autores, String principaisassuntos){
        super(nome,data,autores);
        this.nomeeditora=nomeeditora;
        this.anopublicacao = anopublicacao;
        this.volume = volume;
        this.principaisassuntos = principaisassuntos;
    }
}
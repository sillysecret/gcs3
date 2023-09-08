public class Cd extends item{
    
    private String genero; 
    private String nomemsc;


    //@Override 
    public Cd(String genero,String nomemscString,String nome, String data,  String autores){
        super(nome, data, autores); 
        this.genero=genero;
        this.nomemsc = nomemsc;
    }


}

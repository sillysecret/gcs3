

public class item {
    protected static int id;
    protected String nome;
    protected String data;
    protected String datadeaquisição;
    protected String listadeautores;
  

    public item(String nome,String data,String autores){
        ObjectUtils id = new ObjectUtils();
        this.nome = nome;
        this.id = id.generateIntID();
        this.data = data;
        this.listadeautores = autores;
    }



}

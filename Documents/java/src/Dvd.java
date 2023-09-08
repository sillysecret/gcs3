import java.lang.reflect.Constructor;

public class Dvd extends item{
    private String tipo;
    private String descri;

    public Dvd(String tipo,String descri,String nome, String data,  String autores){
        super(nome, data, autores);
        this.descri = descri;
        this.tipo = tipo;
    }
}

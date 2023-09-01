import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class item {
    protected int id;
    protected String nome;
    protected Date datadeaquisição;
    protected String listadeautores;
    protected SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public item(String nome,String data,String autores){
        ObjectUtils id = new ObjectUtils();
        this.id = id.generateIntID();
        try {
            this.datadeaquisição = formatter.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.listadeautores = autores;
    }



}

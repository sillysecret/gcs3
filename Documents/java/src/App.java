import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cd> cds = new ArrayList();
        //ArrayList<Dvd> dvds = new ArrayList<Dvd>();
        ArrayList<Livro> livros = new ArrayList<Livro>();
        ArrayList<Revista> revistas = new ArrayList<Revista>();


        // ler a "String"

         cds.stream().filter(cd -> cd.nome.contains("string")).forEach(cd -> System.out.println(cd.nome));
         //dvds.stream().filter(dvd -> dvd.getNome().contains("string")).forEach(dvd -> System.out.println(dvd.getNome()));
         livros.stream().filter(livro -> livro.nome.contains("string")).forEach(livro -> System.out.println(livro.nome));
         revistas.stream().filter(revista -> revista.nome.contains("string")).forEach(revista -> System.out.println(revista.nome));
    }
}

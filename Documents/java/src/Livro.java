public class Livro extends item {

        private String nomeeditora;
        private int anopublicacao;

        public Livro(String nomeeditora,int anopublicacao,String nome,String data,String autores){
            super(nome,data,autores);
            this.nomeeditora=nomeeditora;
            this.anopublicacao = anopublicacao;
        }
}
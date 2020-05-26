import java.util.ArrayList;

class Aluno {

  private String nome;
	ArrayList<Avaliacao> lista = new ArrayList<Avaliacao>();
  //coleção de dados implementado sobre uma estrutura estatica de TAD, exemplo []
	//permitindo como vantagens alguns comportamentos (add, size, contains, remove, get...)
	//e principalmente a sensacao de dinamismo quanto ao controle do tamanho.
	//arraylist encapsula as operacoes de manipulacao de uma lista*
  
  



  //construtor
  public Aluno(String n) {
      nome = n;
  }
  
  public String getNome() {
    return nome;
  }

}









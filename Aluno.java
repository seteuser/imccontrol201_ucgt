import java.util.ArrayList;

class Aluno {

  private String nome;
  ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
  

  public void setNome(String n) {
      nome = n;
  }
  
  public String getNome() {
    return nome;
  }

  public void adicionaAvaliacao(Avaliacao nova){

    this.avaliacoes.add(nova);

  }

  public ArrayList<Avaliacao> avaliacoes(){

    return this.avaliacoes;

  }

  public Avaliacao getPrimeiraAvaliacao(){

    return this.avaliacoes.get(0);

  }

  public int totalAvaliacoes(){

    return this.avaliacoes.size();

  }







}









class Teste {


  public void executar(){

    Aluno aluno1 = new Aluno();
    aluno1.setNome("Nelson");
    Avaliacao av11 = new Avaliacao(90,2);


    Aluno aluno2 = new Aluno();
    aluno2.setNome("Dolores");
    Avaliacao av21 = new Avaliacao(50,1);
    Avaliacao av22 = new Avaliacao(20,1);
    Avaliacao av23 = new Avaliacao(30,1);


    //atribuindo avaliacao ao aluno
		aluno1.adicionaAvaliacao(av11); //aluno1.avaliacoes.add(av11);
		
    aluno2.adicionaAvaliacao(av21); //aluno2.avaliacoes.add(av21);
		aluno2.adicionaAvaliacao(av22); //aluno2.avaliacoes.add(av22);
    aluno2.adicionaAvaliacao(av23); 



    //relatorio
		this.mostraAluno(aluno1);
		this.mostraAluno(aluno2);
    
  }




   private void mostraAluno(Aluno aluno) {
      System.out.println("\nHistorico de aluno:");
      System.out.println("Nome: " + aluno.getNome());
      System.out.println("Avaliacoes realizadas: " + aluno.totalAvaliacoes());

      for (int i=0; i<aluno.totalAvaliacoes();i++){
        Avaliacao temp = aluno.avaliacoes().get(i);
        System.out.print(i+1 + ") ");
        System.out.print("Indice: " + temp.indice());
				System.out.println(" [" + temp.classificacao() + "]");
			} 
	 }
}
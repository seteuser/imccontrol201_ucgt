class Teste {

  public void executar(){

    Aluno aluno1 = new Aluno("Nelson");
    Avaliacao av11 = new Avaliacao(90,2);


    Aluno aluno2 = new Aluno("Dolores");
    Avaliacao av21 = new Avaliacao(50,1);
    Avaliacao av22 = new Avaliacao(20,1);



    //atribuindo avaliacao ao aluno
		aluno1.lista.add(av11);
		
    aluno2.lista.add(av21);
		aluno2.lista.add(av22);
  




    //relatorio
		this.mostraAluno(aluno1);
		this.mostraAluno(aluno2);
    
  }




   private void mostraAluno(Aluno aluno) {
      System.out.println("\nListagem de alunos:");
      System.out.println(aluno.getNome());
      System.out.println("Avaliacoes realizadas: " + aluno.lista.size());

      for (int i=0; i<aluno.lista.size();i++){
        Avaliacao temp = aluno.lista.get(i);
        System.out.println("Indice = " + temp.indice());
				System.out.println("Classificacao = " + temp.classificacao());
			} 
    
	 }

}
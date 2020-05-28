class Avaliacao {

	private float peso;
	private float altura;
	//private float indice;
  Aluno[] a = new Aluno[10] ;

  public Avaliacao(float p, float a) {
      this.peso = p;
			this.altura = a;
  }
  
  public float getPeso() {
    return this.peso;
  }

  public float getAltura() {
    return this.altura;
  }

  public float indice() {
     float imc = this.peso / (this.altura * this.altura);
		 return imc; 
	} 

  public String classificacao() {
      
			if (indice() < 18) 
         return "MAGRO";
      if (indice() > 30)
         return "OBESO";
      return "EQUILIBRADO";
  }
  





}
class IMC {

  public static double indice(double p, double a){
      double imc = p / (a * a);
      return imc; 
  }
  
  public static String classificacao(double indice) {
      if (indice < 18) 
         return "MAGRO";
      if (indice > 30)
         return "OBESO";
      return "EQUILIBRADO";
  }
  
  public static float indice(Avaliacao av) {
     float imc = av.getPeso() / (av.getAltura() * av.getAltura());
		 return imc; 
	} 

  public static String classificacao(Avaliacao av) {
      
	    float indice = indice(av);
			
			if (indice < 18) 
         return "MAGRO";
      if (indice > 30)
         return "OBESO";
      return "EQUILIBRADO";
  }
  






}
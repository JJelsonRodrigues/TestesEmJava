
public class ImpostoDeRenda {
	    public static void main(String[] args) {

	    //	De 1900.0 - 2800.0 = IR 7.5% e pode deduzir R$ 142
	    //	De 2800.01 - 3751.0 = IR 15% e pode deduzir R$ 350
	    //	De 3751.01 - 4664.00 = IR 22.5% e pode deduzir R$ 636
	        double salario = 3300.0;
	    
	     if(salario >= 1900.0 && salario <= 2800.0) {
	    	 System.out.println("Seu IR é de 7.5%, podendo deduzir na declaração o valor de R$ 142.00");
	     } else if (salario >= 2800.0 && salario <= 3751.0) { 
	    	 	System.out.println("Seu IR é de 15%, podendo deduzir na declaração o valor de R$ 350.00");
	    	 } else if (salario >= 3751.0 && salario <= 4664.0) {
	    		 	System.out.println("Seu IR é de 22.5%, podendo deduzir na declaração o valor de R$ 636.00");
	    	 }
	     
	     System.out.println(salario);
	}
}


public class somaDivisão {

	public static void main(String[] args) {
		double num1 = 10.5;
		double num2 = 5;
		
		System.out.println("A divisão entre " + num1 + " e " + num2 + " é igual à " +operacoes.divisao(num1,num2));
		System.out.println("A multiplicação entre " + num1 + " e " + num2 + " é igual à " +operacoes.multiplicacao(num1,num2));
	}
}

class operacoes {
	
	public static double divisao(double num1, double num2) {
		return (num1/num2);
	}
	
	public static double multiplicacao(double num1, double num2) {
		return (num1*num2);
	}
	
}
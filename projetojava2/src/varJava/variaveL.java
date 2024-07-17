package varJava;

public class variaveL {

	/*Varialvel Global é acessivel a todos*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um metodo auto executavel em Java*/
	public static void main(String[]args) {
	
       /*Variável local porque pertence somente a esse método e o valor fica dentro do metodo*/
	int maiorIdade = 18;
		System.out.println("Valor variavel Local =" + maiorIdade);
		metodo2();
	}

	public static void metodo2() {
		System.out.print("Valor da variável Global = " + maiorIdadeGlobal);
	
}

}

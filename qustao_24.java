import java.util.Scanner;
 
public class qustao_24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o custo do carro de fabrica do carro:" );
		double custo_fabrica = scanner.nextDouble();
		
		System.out.print("Digite a porcentagem de distribuidor");
		double distribuidor = scanner.nextDouble();

		System.out.print("Digite os impostos");
		double impostos = scanner.nextDouble();
		
		double custo_carro = custo_fabrica + distribuidor + impostos;
		
		double desconto = ( custo_carro *73 ) / 100;
		  
		System.out.print("O custo final ao consumidor é: " + desconto );
		
	}
}



package inventory;
import java.util.Scanner;

public class ProductTester {

	
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   int tempNumber;
	   String tempName;
	   int tempQtd;
	   double tempPrice;
	   int maxSize = -1;
	   
	   // mostrar para o usuario
	   System.out.println("Insira o número de produtos que gostaria de adicionar");
	   System.out.println("Insira 0 (Zero) se não quiser adicionar produtos");
	   maxSize = in.nextInt();
	   if(maxSize < 0) {
		   System.out.println("Valor inserido está incorreto");
	   }
	   // avisar o usuario até que ele insira um número >= 0
	   do {
		   try {
			   // mostrar para o usuario
			   System.out.println("Insira o número de produtos que gostaria de adicionar");
			   System.out.println("Insira 0 (Zero) se não quiser adicionar produtos");
			   maxSize = in.nextInt();
			   if(maxSize < 0) 
				   System.out.println("Valor inserido está incorreto");
		   } catch(Exception e) {
			   System.out.println(e);
			   in.nextLine();
		   }
			   
	   } while(maxSize<0);
	   
	   if(maxSize == 0) {
	             System.out.println("Nenhum produto requerido para ser registrado!");
	   } else {
		   Product[] products = new Product[maxSize]; 
		   for(int i = 0; i < maxSize; i++) {
			   in.nextLine();
			   System.out.println("\n\n Digite o nome do Produto: ");
			   tempName = in.nextLine();
			   System.out.println("Digite a quantidade do estoque: ");
			   tempQtd = in.nextInt();
			   System.out.println("Digite o preço: ");
			   tempPrice = in.nextDouble();
			   System.out.println("Digite o Indentificador único: ");
			   tempNumber = in.nextInt();
		   }
		   
		   for(Product product: products) {
			   System.out.println(product);
		   }
	   }
	   in.close();
      
   }
}
    		

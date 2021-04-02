import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double diagonalMaior,diagonalMenor,area;
		
		System.out.println("Informe a diagonal Maior");
		diagonalMaior=teclado.nextDouble();
		System.out.println("informe a diagonal Menor");
		diagonalMenor=teclado.nextDouble();
		
		area= (diagonalMaior*diagonalMenor)/2;
		
		System.out.println("A area do losango é "+area);
		
		teclado.close();
		


	}

}

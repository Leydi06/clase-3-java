import java.util.Scanner;
public class caso8 {
///Leydi arce
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota: ");
		int nota = sc.nextInt();
	
	
		if (nota >=0 && nota <=7)
		    System.out.println("Sin palabra") ;
		else if (nota >= 8 && nota <=10)
			System.out.println(" Malo") ;
		else if (nota >= 11 && nota <=14)
			System.out.println(" Regular") ;
		else if (nota >=15 && nota <= 17)
		    System.out.println(" Notable") ;
		else
		    System.out.println(" Excelente");
			

	}

}

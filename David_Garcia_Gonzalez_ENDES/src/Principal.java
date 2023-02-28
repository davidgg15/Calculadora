import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
	Operacion op =new Operacion();
	Scanner teclado = new Scanner(System.in);
	char conti;
	do {
	System.out.print("Escoge la operacion: 1-Suma 2-Resta 3-Multiplicacion 4-Division");
	int  respu=teclado.nextInt(); 
	System.out.print("Introduce valor a:");
	int  a=teclado.nextInt(); 
	System.out.print("Introduce valor b:");
	int  b=teclado.nextInt(); 
	op.setA(a);
	op.setB(b);
	switch(respu) {
	case 1:
		op.suma();
		break;
	case 2:
		op.resta();
		break;
	case 3:
		op.multiplicacion();
		break;
	case 4:
		op.division();
		break;
	}
	System.out.print("Quieres realizar otra operacion (S/N): ");
	conti = teclado.next().charAt(0);
	conti = Character.toUpperCase(conti);
	}
	while (conti == 'S');
	System.out.print("Fin Programa");
	}

}


public class Operacion {
	
private double a;
private double b;

public Operacion() {
	super();
	// TODO Auto-generated constructor stub
}

public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(double b) {
	this.b = b;
}

public double suma() {
double suma=a+b;
return suma;
}

public double resta() {
double resta=a-b;
return resta;
}
public  double multiplicacion() {
double multiplicaion=a*b;
return multiplicaion;
}
public double division() {
double division=a/b;
return division;
}
}

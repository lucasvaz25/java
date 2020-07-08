package entities;

public class Triangle {
// declaracao dos atributos
   public double a;
   public double b;
   public double c;
   
   public double area() {  // funcao
	   double p = (a + b + c) / 2.0;
	   return Math.sqrt(p * (p - a) * (p - b) * (p - c));
   }

}

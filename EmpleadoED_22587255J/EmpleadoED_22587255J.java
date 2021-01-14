package EmpleadoED_22587255J;
import java.util.*;

public class EmpleadoED_22587255J {
	
 static final double FACTOR_HORA_EXTRA = 1.2;
 private String nombreCompleto, dni;
 private double salarioBasePorHora = 10.56;
 
 public EmpleadoED_22587255J(String nombreCompleto, String dni) {
 this.nombreCompleto = nombreCompleto;
 this.dni = dni;
 }
 
 public double getSalarioEsteMes(int horasExtra) {
	 double cantidadExtra, salarioFinal;
	 cantidadExtra = horasExtra * this.salarioBasePorHora *
			 FACTOR_HORA_EXTRA;
	 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
	 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
	 return salarioFinal;
 }

 
 // Este m�todo no lo comentaremos con JavaDoc
 public static void main(String[] args) {
	 // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE L�NEA
	 EmpleadoED_22587255J emp = new EmpleadoED_22587255J("ANDR�S GALLARDO","22487255J");
	 int horasExtra = 2;
	 System.out.println("El salario de " + emp.nombreCompleto + " este mes ser� de " + emp.getSalarioEsteMes(horasExtra)
	 + " euros, al hacer " + horasExtra + " horas extra.");
 	}
}
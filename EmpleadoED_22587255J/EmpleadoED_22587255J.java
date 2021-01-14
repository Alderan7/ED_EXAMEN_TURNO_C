package EmpleadoED_22587255J;
import java.util.*;

/**
 * Ejercicio pr�ctico examen EVAL 1 ED
 * 
 * @author ANDR�S GALLARDO DNI 22587255J
 * @version 1.0
 *
 */

public class EmpleadoED_22587255J {
	
 static final double FACTOR_HORA_EXTRA = 1.2;
 private String nombreCompleto, dni;
 private double salarioBasePorHora = 10.56;
 
 /**
  * Constructor con tres par�metros
  * 
  * @param nombreCompleto nombre completo en may�sculas
  * @param dni documento nacional de identidad con letra y sin espacios
  */
 
 
 public EmpleadoED_22587255J(String nombreCompleto, String dni) {
	 this.nombreCompleto = nombreCompleto;
	 this.dni = dni;
 }
 
 /**
  * Calcula el salario bruto mensual en funci�n del salario base por hora y las horas extras
  * El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA
  * 
  * @param horasExtra numero de horas extra dedicadas redondeado a la baja (entero)
  * 
  * @return devuelve el salario bruto mensual en euros con dos decimales
  */
 
 public double getSalarioEsteMes(int horasExtra) {
	 double cantidadExtra, salarioFinal;
	 cantidadExtra = horasExtra * this.salarioBasePorHora *
			 FACTOR_HORA_EXTRA;
	 salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
	 salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
	 return salarioFinal;
 }

 /**
  * Este programa devuelve los datos del empleado y el c�lculo del salario que le corresponde al haber realizado
  * un n�mero concreto de horas extras  * 
  * 
  */

 public static void main(String[] args) {

	 EmpleadoED_22587255J emp = new EmpleadoED_22587255J("ANDR�S GALLARDO","22487255J");
	 int horasExtra = 2;
	 System.out.println("El salario de " + emp.nombreCompleto + " este mes ser� de " + emp.getSalarioEsteMes(horasExtra)
	 + " euros, al hacer " + horasExtra + " horas extra.");
 	}
}
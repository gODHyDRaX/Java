import java.util.Scanner;

public class Ejercicio2 {
 public static void main(String[] args) {  
    String nombre_empresa = "ESKALA";
    String nombre_usuario;
    // los datos sieguintes no tienen un valor inicial
    int nit ;
    double H_entrada;
    double H_salida;
   
    Scanner nombre =new Scanner(System.in);
    System.out.print("Ingrese su nombre: ");
    nombre_usuario = nombre.nextLine();

    Scanner entrada_nit = new Scanner(System.in);
    System.out.print("Ingrese su nit: ");
    nit = entrada_nit.nextInt();

    Scanner hora_entrada = new Scanner(System.in);
    System.out.print("Ingrese la hora de entrada: ");
    H_entrada = hora_entrada.nextDouble();

    Scanner hora_salida = new Scanner(System.in);
    System.out.print("Ingrese la hora de salida: ");
    H_salida = hora_salida.nextDouble();
//procesos
//costo del parqueo por hora
    double total = (H_salida - H_entrada)*10;

//resultados 
       System.out.println("");
    System.out.println("+------------------------------------------+");
    System.out.println("|                                          |");
    System.out.println("|Nombre de la empresa: "+nombre_empresa+"              |");
    System.out.println("|Nombre usuario: "+nombre_usuario+"              |");
    System.out.println("|NIT: "+nit+"                                |");
    System.out.println("|Hora de entrada: "+H_entrada+"                     |");
    System.out.println("|Hora de salida: "+H_salida+"                      |"); 
    System.out.println("|Total: "+total+"                               |");
    System.out.println("|                                          |");
    System.out.println("+------------------------------------------+");
    System.out.println("");
 }
}

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.plaf.synth.SynthOptionPaneUI;


public class prueba2{
    public static void main(String[] args) {
        String bienvenida = "Bienvenida";
        String t1;
        String t2;
        String t3;
        String t4;
        String t5;

         Scanner entrada_t1 = new Scanner(System.in);
         System.out.println("Ingrese la tarea");
         t1 = entrada_t1.nextLine();
         Scanner entrada_t2  = new Scanner(System.in);
         System.out.println("Ingrese la tarea");
         t2 = entrada_t2.nextLine();
         Scanner entrada_t3 = new Scanner(System.in);
         System.out.println("Ingrese la tarea");
         t3 = entrada_t3.nextLine();
         Scanner entrada_t4 = new Scanner(System.in);
         System.out.println("Ingrese la tarea");
         t4 = entrada_t4.nextLine();
         Scanner entrada_t5 = new Scanner(System.in);
         System.out.println("Ingrese la tarea");
         t5 = entrada_t5.nextLine();

         System.out.println("+----------------------------------+");
         System.out.println(bienvenida);
         System.out.println(t1);
         System.out.println(t2);
         System.out.println(t3);
         System.out.println(t4);
         System.out.println(t5);
         System.out.println("+----------------------------------+");
        
         System.out.println("[0] Nueva tarea");
         System.out.println("[X] complretar tarea");
         Scanner opcionimput = new Scanner(System.in);
         System.out.println(": ");
         String opcion = opcionimput.nextLine();
         if (opcion.equalsIgnoreCase("0")) {
            Scanner nuevatareaimput =  new Scanner(System.in);
            System.out.println("0 : ");
            String nuevaTarea = nuevatareaimput.nextLine();
            System.out.println("tarae agragada");
            System.out.println("");

            System.out.println("+----------------------------------+");
            System.out.println(bienvenida);
            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
            System.out.println(t4);
            System.out.println(t5);
            System.out.println(nuevaTarea);
            System.out.println("+----------------------------------+");
         }
         else if (opcion.equalsIgnoreCase("x")) {
            Scanner completarimput = new Scanner(System.in);
            System.out.println("X : ");
            String completar = completarimput.nextLine();

            System.out.println("Tarea completada"  );

         }
         
         
         

        
        }
}

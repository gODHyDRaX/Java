import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class prueba{
    public static void main(String[] args) {
        int datos;
        String paciente1 = "Dereck";
        String paciente2 = "Julyan";
        String paciente3 = "Anleu";
        String paciente4 = "David";
        String paciente5 = "Justin";

        String enfermera1 = "Gimena";
        String enfermera2 = "Katy";
        String enfermera3 = "Madelyn";
        String enfermera4 = "Marelyn";
        String enfermera5 = "Dana";

        int habitaciones1 = 234;
        int habitaciones2 = 3252;
        int habitaciones3 = 232;
        int habitaciones4 = 23;
        int habitaciones5 = 1234;

        Scanner entrada_datos = new Scanner(System.in);
        System.out.println("+-------------------------------+");
        System.out.println("Bienvenido al hospital SCL");
        System.out.println("[1] : Pacientes");
        System.out.println("[2] : Enfermeras");
        System.out.println("[3] : Habitaciones");
        System.out.println("+-------------------------------+");
        datos = entrada_datos.nextInt();

        if (datos == 1) {
            System.out.println("+-------------------------------+");
            System.out.println("Bienvenido al hospital SCL");
            System.out.println(": Pacientes");
            System.out.println("~ "+ paciente1);
            System.out.println("~ "+ paciente2);
            System.out.println("~ "+ paciente3);
            System.out.println("~ "+ paciente4);
            System.out.println("~ "+ paciente5);
            System.out.println("+-------------------------------+");
        }
        else{
            if (datos == 2) {
                System.out.println("+-------------------------------+");
                System.out.println("Bienvenido al hospital SCL");
                System.out.println(": Enfermeras");
                System.out.println("~ "+ enfermera1);
                System.out.println("~ "+ enfermera2);
                System.out.println("~ "+ enfermera3);
                System.out.println("~ "+ enfermera4);
                System.out.println("~ "+ enfermera5);
                System.out.println("+-------------------------------+");
            }
            else{
                if (datos == 3) {
                    System.out.println("+-------------------------------+");
                    System.out.println("Bienvenido al hospital SCL");
                    System.out.println(": Habitaciones");
                    System.out.println("~ "+ habitaciones1);
                    System.out.println("~ "+ habitaciones2);
                    System.out.println("~ "+ habitaciones3);
                    System.out.println("~ "+ habitaciones4);
                    System.out.println("~ "+ habitaciones5);
                    System.out.println("+-------------------------------+");
                    
                }
                else{
                    System.out.println("+-------------------------------+");
                    System.out.println("Dato erroneo");
                    System.out.println("+-------------------------------+");
                }
            }
        }

    }
}
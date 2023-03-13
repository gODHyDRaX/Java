import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Prueba3 {
    public static void main(String[] args) {
        
        int datos;

        Scanner entrada_datos = new Scanner(System.in);
        System.out.println("+-----------------------------+");
        System.out.println("          Bienvenido          ");
        System.out.println("       Datos del grado        ");
        System.out.println("[0]: Asignaturas");
        System.out.println("[1]: No. Periodos");
        System.out.println("[2]: Profesores ");
        System.out.println("[3]: Correos");
        System.out.println("");
        System.out.println("[?]: 0");
        System.out.println("+-----------------------------+");

        datos = entrada_datos.nextInt();

        if (datos == 0) {
            System.out.println("-----------------------------");
            System.out.println("         Asignaturas         ");
            System.out.println("-----------------------------");
            System.out.println("[1] Aplicada");
            System.out.println("[2]: Mate");
            System.out.println("[3]: Ingles");
            System.out.println("[4]: Sistemas");
            System.out.println("[5]: conta");
            System.out.println("[6]: laboratorio");
            System.out.println("[7]: literatura");
            System.out.println("[8]: Sociales");
            System.out.println("[9]: Filosofia");
            System.out.println("[10]: Fisica fundamental");
            System.out.println("[11]: Educacion fisica");
        }
        else{
            if (datos == 1) {
                System.out.println("-----------------------------");
                System.out.println("          Periodos           ");
                System.out.println("-----------------------------");
                System.out.println("[1]: Periodos: 7");
                System.out.println("[2]: Periodos: 7 ");
                System.out.println("[3]: Periodos: 7");
                System.out.println("[4]: Periodos: 3");
                System.out.println("[5]: periodos: 4");
                System.out.println("[6]: Periodos: 5");
                System.out.println("[7]: Periodos: 5");
                System.out.println("[8]: Periodos: 6");
                System.out.println("[9]: Periodos: 3");
                System.out.println("[10]: Periodos: 5");
                System.out.println("[11]: Periodos: 2");
            }
            else{
                if (datos == 2) {
                    System.out.println("-----------------------------");
                    System.out.println("          Profesores         ");
                    System.out.println("-----------------------------");
                    System.out.println("[1] Jossue Fuentes");
                    System.out.println("[2]: Pablo de leon");
                    System.out.println("[3]: Iliana sonali");
                    System.out.println("[4]: Jossue Fuentes");
                    System.out.println("[5]: Carmen aguilar");
                    System.out.println("[6]: Jossue Fuentes");
                    System.out.println("[7]: Jerico Flor");
                    System.out.println("[8]: Erika Xot");
                    System.out.println("[9]: Erika Xot");
                    System.out.println("[10]: Alfredo Chonay");
                    System.out.println("[11]: Carlos Hernandez");
                }
                else{
                    if (datos == 3) {
                        System.out.println("-----------------------------");
                        System.out.println("           Correos           ");
                        System.out.println("-----------------------------");
                        System.out.println("[1]: jefuentes@scl.edu.gt");
                        System.out.println("[2]: padeleon@scl.edu.gt");
                        System.out.println("[3]: isgonzalez@scl.edu.gt");
                        System.out.println("[4]: jefuentes@scl.edu.gt");
                        System.out.println("[5]: cyaguilar@scl.edu.gt");
                        System.out.println("[6]: jefuentes@scl.edu.gt");
                        System.out.println("[7]: jfcastro@scl.edu.gt");
                        System.out.println("[8]: ebxot@scl.edu.gt");
                        System.out.println("[9]: ebxot@scl.edu.gt");
                        System.out.println("[10]: aacojolon@scl.edu.gt");
                        System.out.println("[11]: crhernandez@scl.edu.gt");
                    }
                    else{
                        System.out.println("-----------------------------");
                        System.out.println("        Dato erroneo         ");
                        System.out.println("-----------------------------");
                    }
                }
                   
            }
            
        }
    }
}


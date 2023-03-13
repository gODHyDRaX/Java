public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre_colegio = "Santa catalina laboure";
        String grado = "4to.Computacion";
        int alumnos = 23;
        double altura = 1.73;
        boolean nuevo_ingreso = true;
        int norma = 30;
        boolean resultadoNorma= false;

        resultadoNorma = norma > alumnos;

        System.out.println("");
        System.out.println("+------------------------------------------+");
        System.out.println("|                   SCL                    |");
        System.out.println("|Nombre del colegio: "+nombre_colegio+"|");
        System.out.println("|Grado: "+grado+"                    |");
        System.out.println("|Cantidad de alumnos: "+alumnos+"                   |");
        System.out.println("|Altura: "+altura+"                              |");
        System.out.println("|Es de nuevo ingreso: "+nuevo_ingreso+"                 |"); 
        System.out.println("+------------------------------------------+");
        System.out.println("Norma:"+resultadoNorma);
        System.out.println("");
            


    }   
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double nota = 0, acumulado = 0, cantidadNotas= 0;
        System.out.println("Ingrese la cantidad de notas a promediar: ");
        cantidadNotas = sc.nextDouble();
        System.out.println("Promedio de notas Lógica Programación ");
//        for(int i = 1; i <= cantidadNotas; i++){
//            System.out.println("Ingrese la nota" + i + ": ");
//            nota = sc.nextDouble();
//            /*acumulado = acumulado + nota; otra manera de hacer lo de abajo*/
//           acumulado+=nota;
//        }
        int i = 1;
        while (i <= cantidadNotas){
            System.out.println("Ingrese la nota " + i + ": ");
            nota = sc.nextDouble();
            acumulado += nota;
            i++;
        }
        System.out.println("El promedio del estudiante es: " + (acumulado/cantidadNotas));
    }
}
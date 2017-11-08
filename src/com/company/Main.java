package com.company;
import java.util.Scanner;
public abstract class Main
{
    public void main(String[] args){
        pilas p = new pilas();
        p.push(2);
        p.push(8);
        p.push(1);
        
        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.cima();
        p.pop();
        p.peek();
        mostrarMenu();
    }
    Scanner sc = new Scanner(System.in);
    public void mostrarMenu() {

    String opcion;
    do {
        System.out.println("********** Menú Principal ***********");
        System.out.println("*            1. Insertar.           *");
        System.out.println("*            2. Mostrar.            *");
        System.out.println("*            3. Buscar.             *");
        System.out.println("*            4. Eliminar.           *");
        System.out.println("*            5. Tamaño.             *");
        System.out.println("*            5. Máximo.             *");
        System.out.println("*            5. Mínimo.             *");
        System.out.println("*            0. Terminar.           *");
        System.out.println("*************************************");
        System.out.print("           Elija una opción: ");
        opcion = sc.nextLine();

        switch (opcion) {
            case "0": {
                System.out.println("¡Bye!");
                System.exit(0);
                break;
            }
            case "1": {
                listaEmpleados();
                break;
            }
            case "2": {
                altaEmpleado();
                break;
            }
            case "3": {
                buscarEmpleado();
                break;
            }
            case "4": {
                eliminarEmpleado();
                break;
            }
            case "5": {
                modificarEmpleado();
                break;
            }
            default: {
                System.out.println("Opción incorrecta");
                break;
            }
        }
    } while (!opcion.equals("0"));
}

}

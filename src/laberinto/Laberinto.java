/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import java.util.Scanner;

/**
 *
 * @author redes1
 */
public class Laberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escenarios esce = new Escenarios();
        Metodo metodo = new Metodo();

        Scanner lector = new Scanner(System.in);
        int opc;
        int mod = 0;
        do {
            System.out.println("\nJuego laberinto: \n");

            System.out.println("Para jugar use las teclas w = arriba, a = izquierda, s = abajo, d = derecha.\n");
            System.out.println("Si toca la pared mas de 5 veces, habra perdido.\n");
            System.out.println("1.-Laberinto 1");
            System.out.println("2.-Laberinto 2");
            System.out.println("3.-Laberinto 3");
            System.out.println("4.-Laberinto 4");
            System.out.println("5.-Laberinto 5");
            System.out.println("0.- Salir");
            System.out.print("opcion ->");
            opc = lector.nextInt();
            if (opc != 0) {
                System.out.println("Estamos casi listos para empezar, por favor pulse 1 para iniciar: ");
                mod = lector.nextInt();
            }

            switch (opc) {
                case 0:
                    System.out.println("Adios!");
                    break;
                case 1:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioUno(), esce.filaasterico(esce.escenarioUno()), esce.columasterico(esce.escenarioUno()));
                    }
                    break;
                case 2:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioDos(), esce.filaasterico(esce.escenarioDos()), esce.columasterico(esce.escenarioDos()));
                    }
                    break;
                case 3:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioTres(), esce.filaasterico(esce.escenarioTres()), esce.columasterico(esce.escenarioTres()));
                    }
                    break;
                case 4:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioCuatro(), esce.filaasterico(esce.escenarioCuatro()), esce.columasterico(esce.escenarioCuatro()));

                    }
                    break;
                case 5:
                    if (mod == 1) {
                        metodo.Avanzar(esce.escenarioCinco(), esce.filaasterico(esce.escenarioCinco()), esce.columasterico(esce.escenarioCinco()));
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opc != 0);

    }
}

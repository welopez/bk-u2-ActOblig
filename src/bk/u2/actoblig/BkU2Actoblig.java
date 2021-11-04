/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bk.u2.actoblig;

import java.util.Scanner;

/**
 *
 * @author codo
 */
public class BkU2Actoblig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "";
        String apellido = "";
        int edad = 0;
        String hobbie = "";
        String editorPref = "";
        String sistOp = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar nombre: ");
        nombre = sc.nextLine();

        System.out.println("\nIngresar apellido: ");
        apellido = sc.nextLine();

        System.out.println("\nIngresar edad: ");
        do {
            try {
                edad = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Debe ingresar un numero!");
            }
        } while (edad == 0);

        System.out.println("\nIngresar hobbie: ");
        hobbie = sc.nextLine();

        System.out.println("\nIngresar editor de codigo preferido: ");
        editorPref = sc.nextLine();

        System.out.println("\nIngresar sistema operativo utilizado: ");
        sistOp = sc.nextLine();

        //cierro el scanner
        sc.close();

        System.out.println("\n-------------------------------\n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor de codigo pref: " + editorPref);
        System.out.println("Sistema operativo utilizado: " + sistOp);
    }

}

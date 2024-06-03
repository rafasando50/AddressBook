package test;

import AddressBook.*;

public class MenuTest {

    public static void main(String[] args) {
        // Creación de un objeto AddressBook de prueba
        AddressBook book = new AddressBook();
        Menu menu = new Menu(book);

        // Prueba del método displayMenu
        System.out.println("Prueba del método displayMenu:");
        menu.displayMenu(); // Debería imprimir el menú en la consola

        // Prueba del método add
        System.out.println("\nPrueba del método add:");
        menu.add(); // Debería solicitar datos y agregar una entrada a la libreta de direcciones

        // Prueba del método find
        System.out.println("\nPrueba del método find:");
        menu.find(); // Debería solicitar un apellido y mostrar las entradas correspondientes

        // Prueba del método remove
        System.out.println("\nPrueba del método remove:");
        menu.remove(); // Debería solicitar un apellido y eliminar las entradas correspondientes

        // Prueba del método userInput para la opción "a" (file upload)
        System.out.println("\nPrueba del método userInput para la opción 'a' (file upload):");
        menu.userInput("a"); // Debería solicitar un nombre de archivo y cargar las entradas desde el archivo

        // Prueba del método userInput para la opción "b" (add)
        System.out.println("\nPrueba del método userInput para la opción 'b' (add):");
        menu.userInput("b"); // Debería agregar una entrada a la libreta de direcciones

        // Prueba del método userInput para la opción "c" (remove)
        System.out.println("\nPrueba del método userInput para la opción 'c' (remove):");
        menu.userInput("c"); // Debería eliminar una entrada de la libreta de direcciones

        // Prueba del método userInput para la opción "d" (find)
        System.out.println("\nPrueba del método userInput para la opción 'd' (find):");
        menu.userInput("d"); // Debería buscar y mostrar las entradas según el apellido proporcionado

        // Prueba del método userInput para la opción "e" (show)
        System.out.println("\nPrueba del método userInput para la opción 'e' (show):");
        menu.userInput("e"); // Debería mostrar todas las entradas en la libreta de direcciones
    }
}


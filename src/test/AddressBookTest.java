package test;

import java.io.File;
import AddressBook.*;

public class AddressBookTest {

    public static void main(String[] args) {
        // Prueba del constructor y del método show cuando la lista está vacía
        AddressBook addressBook = new AddressBook();
        addressBook.show(); // Debería imprimir "No se encontraron coincidencias"

        // Prueba del método add
        AddressEntry entry1 = new AddressEntry("Jose", "Rodolfo", "Juan escutia 2", "Coatzacoalcos", "Veracruz", 12345, "9211341234", "Jose.Rodolfo@gmail.com");
        AddressEntry entry2 = new AddressEntry("Juan", "Rafa", "Quevedo 10", "Coatzacoalcos", "Veracruz", 96510, "9211889081", "Juan.Rafa@gmail.com");
        addressBook.add(entry1);
        addressBook.add(entry2);

        // Prueba del método show cuando hay elementos en la lista
        addressBook.show(); // Debería imprimir los detalles de las entradas agregadas

        // Prueba del método remove
        addressBook.remove("Rodolfo"); // Debería imprimir la entrada de Jose Rodolfo y solicitar confirmación para eliminarla

        // Prueba del método find
        addressBook.find("Rafa"); // Debería imprimir la entrada de Juan Rafa

        // Prueba del método readFromFile
        File file = new File("personas.txt");
        addressBook.readFromFile(file); // Debería imprimir "Archivo encontrado" si el archivo existe

        // Prueba del método show después de leer desde un archivo
        addressBook.show(); // Debería mostrar todas las entradas leídas desde el archivo
    }
}


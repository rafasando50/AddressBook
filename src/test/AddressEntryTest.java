package test;

import AddressBook.*;

public class AddressEntryTest {

    public static void main(String[] args) {
        // Prueba de los constructores y los métodos getters
        AddressEntry entry1 = new AddressEntry();
        entry1.setFisrtName("Jose");
        entry1.setLastName("Rodolfo");
        entry1.setStreet("Juan escutia 2");
        entry1.setCity("Coatzacoalcos");
        entry1.setState("Veracruz");
        entry1.setZipCode(12345);
        entry1.setPhoneNumber("9211341234");
        entry1.setEmail("Jose.Rodolfo@gmail.com");

        System.out.println("Prueba de constructores y getters:");
        System.out.println(entry1.getFisrtName()); // Debería imprimir "Jose"
        System.out.println(entry1.getLastName()); // Debería imprimir "Rodolfo"
        System.out.println(entry1.getStreet()); // Debería imprimir "Juan escutia 2"
        System.out.println(entry1.getCity()); // Debería imprimir "Coatzacoalcos"
        System.out.println(entry1.getState()); // Debería imprimir "Veracruz"
        System.out.println(entry1.getZipCode()); // Debería imprimir "12345"
        System.out.println(entry1.getPhoneNumber()); // Debería imprimir "9211341234"
        System.out.println(entry1.getEmail()); // Debería imprimir "Jose.Rodolfo@gmail.com"

        // Prueba del método toString
        System.out.println("\nPrueba del método toString:");
        System.out.println(entry1.toString()); // Debería imprimir todas las entradas de la dirección

        // Prueba de los métodos setters
        AddressEntry entry2 = new AddressEntry();
        entry2.setFisrtName("Juan");
        entry2.setLastName("Rafa");
        entry2.setStreet("Quevedo 10");
        entry2.setCity("Coatzacoalcos");
        entry2.setState("Veracruz");
        entry2.setZipCode(96510);
        entry2.setPhoneNumber("9211889081");
        entry2.setEmail("Juan.Rafa@gmail.com");

        System.out.println("\nPrueba de setters:");
        System.out.println(entry2.getFisrtName()); // Debería imprimir "Juan"
        System.out.println(entry2.getLastName()); // Debería imprimir "Rafa"
        System.out.println(entry2.getStreet()); // Debería imprimir "Quevedo 10"
        System.out.println(entry2.getCity()); // Debería imprimir "Coatzacoalcos"
        System.out.println(entry2.getState()); // Debería imprimir "Veracruz"
        System.out.println(entry2.getZipCode()); // Debería imprimir "96510"
        System.out.println(entry2.getPhoneNumber()); // Debería imprimir "9211889081"
        System.out.println(entry2.getEmail()); // Debería imprimir "Juan.Rafa@gmail.com"
    }
}


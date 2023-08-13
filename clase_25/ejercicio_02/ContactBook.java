package clase_25.ejercicio_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    public static void main(String[] args){
        /**
         * 2. Agenda de contactos:
         * Desarrolla una aplicación de agenda de contactos
         * en la que los usuarios puedan agregar nombres y números
         * de teléfono. Implementa funciones para agregar,
         * buscar y eliminar contactos utilizando un HashMap
         * donde los nombres son las clave y los números son los valores
         */

        Map<String, Persona> listaDeContactos = new HashMap<>();

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Ingrese un DNI: ");
            String dni = teclado.nextLine();
            System.out.println("Ingrese un teléfono: ");
            String telef = teclado.nextLine();
            System.out.println("Ingrese un nombre: ");
            String name = teclado.nextLine();


            Persona persona = new Persona();
            persona.setNombre(name);
            persona.setDni(dni);
            persona.setTelefono(telef);
            listaDeContactos.put(dni, persona);
        }

        System.out.println("Ingrese el DNI a buscar");
        String dni = teclado.nextLine();
        Persona persona = listaDeContactos.get(dni);
        System.out.println(persona.resumen());
    }
}

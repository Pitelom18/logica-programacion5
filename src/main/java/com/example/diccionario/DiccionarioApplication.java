package com.example.diccionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class DiccionarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiccionarioApplication.class, args);

    HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("libro", "book");
        diccionario.put("lapiz", "pencil");
        diccionario.put("hoja", "sheet");
        diccionario.put("coche", "car");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("nube", "cloud");
        diccionario.put("arbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("playa", "beach");
        diccionario.put("montaña", "mountain");
        diccionario.put("rio", "river");

    Random random = new Random();
    String[] palabrasEspanol = new String[5];
    String[] palabrasIngles = new String[5];
    int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;

        System.out.println("¡Bienvenido al juego de traducción de palabras!");
        System.out.println("Se mostrarán 5 palabras en español y deberás escribir su traducción al inglés.");

    // seleccionar 5 palabras al azar del diccionario
    int contador = 0;
        while (contador < 5) {
        int indicePalabra = random.nextInt(diccionario.size());
        String palabraEspanol = (String) diccionario.keySet().toArray()[indicePalabra];
            if (!contiene(palabrasEspanol, palabraEspanol)) {
                palabrasEspanol[contador] = palabraEspanol;
                palabrasIngles[contador] = diccionario.get(palabraEspanol);
                contador++;
                System.out.println("Por favor traduzca la siguiente palabra al inglés: " + palabraEspanol);
            }

        }

    // pedir al usuario las traducciones y comprobar si son correctas
    Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
        System.out.println("Traduce la palabra '" + palabrasEspanol[i] + "':");
        String respuestaUsuario = scanner.nextLine();
        if (respuestaUsuario.toLowerCase().equals(palabrasIngles[i].toLowerCase())) {
            System.out.println("¡Correcto!");
            respuestasCorrectas++;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es '" + palabrasIngles[i] + "'.");
            respuestasIncorrectas++;
        }
    }

    // mostrar resultados
        System.out.println("¡Juego terminado!");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
}
    public static boolean contiene(String[] arreglo, String palabra) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].equals(palabra)) {
                return true;
            }
        }
        return false;
    }

}

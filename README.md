# Proyecto Ruleta de la Suerte

### Integrantes:
+ Ricardo Vega Alonso

+ Yeison González Rascado

## Consideraciones Generales
+ El correcto diseño orientado a objetos del proyecto es importante y formará parte de la nota. El patrón MVC (Modelo-Vista-Controlador) debe respetarse tanto como sea posible, para facilitar futuras mejoras.
+ No olvidar comentar y formatear el código correctamente. Incluyendo Javadock
+ El ejercicio se corregirá en clase, el profesor preguntará por la implicación de cada miembro del grupo, por lo que las notas no serán necesariamente las mismas.
+ Debes entregar una copia de tu proyecto, comprimiendo el proyecto de Netbeans en un archivo zip con el siguiente nombre apellido1_nombre1_apellido2_nombre2_proyecto2.zip

---

## Consideraciones en el código

### Jugadores

Tenemos que leer los jugadores como un array de objetos.
Ya que los declaramos como **jugador arrayJugadores[] = new jugador[numJugadores];**
``` java
jugador arrayJugadores[] = new jugador[numJugadores];
        
for (int i=0; i<arrayJugadores.length; i++){
    System.out.print("Player "+i+" -> ");
    nombre = input.next();
    arrayJugadores[i] = new jugador(nombre); 
}
```


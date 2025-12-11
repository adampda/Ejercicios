
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor COMPLETAR
    public Coche( String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //Getter y setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    // Método acelerar (suma +10) COMPLETAR
    
    public void acelerar (Coche coche) {
        coche.setVelocidad(coche.getVelocidad() + 10);
        System.out.println("El coche ha acelerado hasta " + coche.getVelocidad() + " km/h");
    }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
   
    public void frenar(Coche coche) {
        int frenar = 10;

        if (coche.getVelocidad() <= 0) {
            System.out.println("El coche ya no puede frenar más");
        } else if (coche.getVelocidad() > frenar) {
            System.out.println("El coche no puede frenar tanto");
        } else {
            coche.setVelocidad(coche.getVelocidad() - frenar);
            System.out.printl("Frenada realizada con exito");
        }
    }

    // Método mostrarDatos COMPLETAR
    
    public String mostrarDatos(Coche coche) {
        return "Marca: " + coche.getMarca + ". \nModelo: " + coche.getModelo + ". \nVelocidad: " + coche.getVelocidad;
    }

}



// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//


import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor COMPLETAR

    public Alumno (String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }
   

    // Método añadirNota COMPLETAR
   

    // Método calcularMedia COMPLETAR
    

    // Método mostrarInfo COMPLETAR
    
}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


class CuentaBancaria {

    // atributos COMPLETAR
    

    // constructor COMPLETAR
    

    // método ingresar COMPLETAR
   

    // método retirar COMPLETAR
   

    // método mostrarSaldo COMPLETAR
    
}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//


class Libro {

    // atributos COMPLETAR
    
    
    // constructor COMPLETAR
   

    // método mostrarInfo COMPLETAR
    
}



class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//

public class Main {
    public static void main(String[] args) {

        private Coche coche = new Coche("BMW", "M3", 0);

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.

        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}


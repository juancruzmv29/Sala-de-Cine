package ProyectosPropios.SalaCine;


import java.util.Scanner;

// Ejercicio propio para sala de cines con matrices
public class ejerSalaCines {



    public static void main(String[] args) {


        // Creamos la sala de cine de 23 filas y 12 columnas
        int[][] sala = new int[23][12];
        // Establecemos el precio de la entrada
        int precio_entrada = 600;
        // Establecemos una entrada de teclado
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        // Bandera que va a empezar como un string vacio
        String bandera = "";
        // Ponemos un contador para despues rellenar las salas de cine
        int cont = 0;
        // Iniciamos una variable recaudacion para saber lo que se recuado de la pélicula
        int recaudacion = 0;

        // Llenamos las ubicaciones
        for(int i = 0; i < sala.length; i++) {
            for(int j = 0; j < sala[0].length; j++) {
                cont++;
                sala[i][j] = cont;
            }
        }

        // Aca empieza la ejecucion de venta


        while(!bandera.equalsIgnoreCase("terminar")) {
            System.out.println("Bienvenidos a cinemark");
            System.out.println("Que asiento desea comprar para ver la pelicula?");
            int asiento = teclado.nextInt();

            if(asiento <= 276) {
                for (int i = 0; i < sala.length; i++) {
                    for (int j = 0; j < sala[0].length; j++) {
                        if(sala[i][j] == 0) {
                            System.out.println("Asiento ocupado, elija otro por favor");
                        } else if (sala[i][j] == asiento){
                            System.out.println("Asiento disponible");
                            System.out.println("Su entrada cuesta: $" + precio_entrada);
                            // Ponemos el valor del asiento en 0 para saber que esta ocupoado/comprado
                            sala[i][j] = 0;
                    }
                }
            }

                recaudacion += precio_entrada;
                System.out.println("Desea terminar la operacion?");
                System.out.println("Si desea terminar la compra escriba terminar, si no otro boton para seguir comprando");
                bandera = teclado2.nextLine();
        }







    }




}}

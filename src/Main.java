public class Main {
    public static void main(String[] args) {
        // Definir los límites del espacio de búsqueda
        double x_min = -10;
        double x_max = 10;

        // Definir el incremento de avance
        double delta_h = 0.1;

        // Definir la posición inicial
        double[] current_position = {0, 0};

        // Definir la posición objetivo
        double[] target_position = {5, 0};

        // Definir una variable para almacenar la mejor solución encontrada
        double[] best_solution = null;
        double best_distance = Double.MAX_VALUE;

        // Realizar la búsqueda exhaustiva
        for (double x = (x_min - current_position[0]) / delta_h; x < (x_max - current_position[0]) / delta_h; x++) {
            // Moverse a la nueva posición
            double[] new_position = {current_position[0] + x * delta_h, current_position[1]};

            // Calcular la distancia a la posición objetivo
            double distance = Math.sqrt(Math.pow(new_position[0] - target_position[0], 2) + Math.pow(new_position[1] - target_position[1], 2));

            // Comprobar si es la mejor solución encontrada hasta ahora
            if (distance < best_distance) {
                best_distance = distance;
                best_solution = new_position;
            }
        }

        // Imprimir la mejor solución encontrada
        System.out.println("La mejor solución encontrada es la posición " + java.util.Arrays.toString(best_solution) + " con una distancia de " + best_distance);
    }
}

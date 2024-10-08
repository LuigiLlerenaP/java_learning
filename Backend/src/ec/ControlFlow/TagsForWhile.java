package ec.ControlFlow;

public class TagsForWhile {
    public static void main(String[] args) {
        // Bidimensional array representing students and their nicknames
        String[][] studentNicknames = {
                {"Alice", "Ally", "A-Train"},
                {"Bob", "Bobby", "B-Man"},
                {"Charlie", "Chuck", "Cheese"},
                {"Diana", "Di", "D-Queen"}
        };

        // Etiqueta para el bucle de estudiantes
        studentLoop:
        for (int i = 0; i < studentNicknames.length; i++) {
            System.out.printf("\nNicknames for Student %d: ", i + 1);
            // Etiqueta para el bucle de apodos
            nicknameLoop:
            for (int j = 0; j < studentNicknames[i].length; j++) {
                // Continuar a la siguiente iteración si es el tercer estudiante
                if (i == 2) {
                    continue studentLoop;
                }

                // Sí se encuentra un apodo específico, romper el bucle
                if (studentNicknames[i][j].equals("Bobby")) {
                    System.out.println("\nBreaking out of nickname loop due to 'Bobby'.");
                    break nicknameLoop; // Esto solo sale del bucle de apodos
                }

                System.out.print(studentNicknames[i][j] + "  ");
            }
        }

        // Bidimensional array representing a simple table of scores
        int[][] studentScores = {
                {85, 90, 78},
                {88, 76, 95},
                {92, 84, 89},
                {70, 80, 90}
        };

        // Etiqueta para el bucle de puntuaciones
        scoreLoop:
        for (int i = 0; i < studentScores.length; i++) {
            System.out.printf("\nScores for Student %d: ", i + 1);
            // Etiqueta para el bucle de puntuaciones individuales
            scoreDetailLoop:
            for (int j = 0; j < studentScores[i].length; j++) {
                // Salir del bucle de puntuaciones si es el último estudiante
                if (i == 3) {
                    System.out.println("\nBreaking out of score loop.");
                    break scoreLoop; // Esto sale del bucle de puntuaciones
                }
                System.out.print(studentScores[i][j] + "   ");
            }
        }

        // Bidimensional array representing students and their scores
        String[][] studentsScores = {
                {"Alice", "85", "90", "78"},
                {"Bob", "88", "76", "95"},
                {"Charlie", "92", "84", "89"},
                {"Diana", "70", "80", "90"}
        };
        int i = 0;
        studentScorePLoop: // Etiqueta para el bucle de estudiantes
        while (i < studentsScores.length) {
            System.out.printf("\nScores for Student %s: ", studentsScores[i][0]);
            int j = 1;
            studentScoreCLoop: // Etiqueta para el bucle de puntuaciones
            while (j < studentsScores[i].length) {
                // Si la puntuación es igual a 90, romper el bucle de puntuaciones
                if (studentsScores[i][j].equals("90")) {
                    System.out.println("\nBreaking out of score loop due to score 90.");
                    break studentScoreCLoop; // Salir del bucle de puntuaciones
                }

                // Imprimir la puntuación
                System.out.print(studentsScores[i][j] + "   ");
                j++;
            }
            i++;
        }


    }
}

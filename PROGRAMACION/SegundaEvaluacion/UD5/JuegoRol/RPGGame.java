import java.util.Scanner;

public class RPGGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crear un nuevo mundo
        World world = new World();

        //Crear un jugador
        Player player = createPlayer(sc);


        //Iniciar el juego
        while (true) {
            displayMainMenu();

            int eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    world.explore();
                    break;
                case 2:
                    world.showPlayerStatus();
                    break;
                case 3:
                    world.showInventory();
                    break;
                case 4:
                    world.showQuests();
                    break;
                case 5:
                    world.showMap();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");

            }

            // Función para crear un nuevo jugador
            private static Player createPlayer(Scanner scanner) {
                System.out.println("¡Bienvenido al mundo RPG!");
                System.out.print("Ingresa el nombre de tu personaje: ");
                String playerName = scanner.next();

                // Mostrar opciones de clases
                System.out.println("Elige una clase para tu personaje:");
                System.out.println("1. Guerrero");
                System.out.println("2. Mago");
                System.out.println("3. Ladrón");
                int classChoice = sc.nextInt();

                // Crear el jugador con base en la clase elegida
                PlayerClass playerClass;
                switch (classChoice) {
                    case 1:
                        playerClass = new Warrior();
                        break;
                    case 2:
                        playerClass = new Mage();
                        break;
                    case 3:
                        playerClass = new Thief();
                        break;
                    default:
                        throw new IllegalArgumentException("Clase no válida");
                }

                // Crear y devolver un nuevo jugador
                return new Player(playerName, playerClass);
            }

            // Función para mostrar el menú principal
            private static void displayMainMenu() {
                System.out.println("\nMenú Principal:");
                System.out.println("1. Explorar");
                System.out.println("2. Estado del Personaje");
                System.out.println("3. Inventario");
                System.out.println("4. Misiones");
                System.out.println("5. Mapa");
                System.out.println("6. Salir");
                System.out.print("Elige una opción: ");
            }
        }


        }
    }
}

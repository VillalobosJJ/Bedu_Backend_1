import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Command> stack = new Stack<>();

        Command incrementarCommand = new IncrementarCommand();
        Command incrementar10Command = new Incrementar10Command();
        Command multiplicarPor2Command = new MultiplicarPor2Command();

        int counter = 0;

        int option = 0;

        while (option != 5) {
            System.out.println("\nValor actual: " + counter);
            System.out.println("Elige alguna opción:");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por 2 el contador");
            System.out.println("3. Añade 10 al contador");
            System.out.println("4. Deshacer último cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    counter = incrementarCommand.execute(counter);
                    stack.add(incrementarCommand);
                    break;
                case 2:
                    counter = multiplicarPor2Command.execute(counter);
                    stack.add(multiplicarPor2Command);
                    break;
                case 3:
                    counter = incrementar10Command.execute(counter);
                    stack.add(incrementar10Command);
                    break;
                case 4:
                    try {
                        Command deshacer = stack.pop();
                        if (deshacer != null){
                            counter = deshacer.unexecute(counter);
                        }
                    } catch (EmptyStackException e){
                        System.out.println("No existen operaciones realizadas");
                    }
                    break;
            }
        }
    }
}
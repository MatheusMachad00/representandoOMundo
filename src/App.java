import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Topic newTopic = new Topic();

        Scanner number = new Scanner(System.in);
        System.out.println("Escolha uma matéria:\n\n0- Javascript\n1- React");
        int choice = number.nextInt();

        System.out.println("\nAssunto: " + newTopic.name[choice] + "\nCategoria: " + newTopic.category[choice]);
        System.out.println("\n" + newTopic.description[choice]);

        Scanner number2 = new Scanner(System.in);
        System.out.println("\nPara fazer exercicios digite 1:");
        int choice2 = number2.nextInt();

        if (choice2 == 1) {
            System.out.println("\n" + newTopic.exercises.question[choice]);
            Scanner number3 = new Scanner(System.in);
            System.out.println("\n1- Verdadeiro\n2- Falso");
            int choice3 = number3.nextInt();
            if (choice == 0 && choice3 == 1) {
                System.out.println("Acertou mizeravi");
            } else if (choice == 0 && choice3 == 2) {
                System.out.println("Errou feio, errou rude");
            } else if (choice == 1 && choice3 == 1) {
                System.out.println("Errou feio, errou rude");
            } else if (choice == 1 && choice3 == 2) {
                System.out.println("Acertou mizeravi");
            } else
                System.exit(0);
            number3.close();
        }
        number2.close();
        number.close();
    }
}

//        "Write a program that allows a user to simulate an edit history that would be used while writing a document.
//         Your program should keep an edit history of 10 items.
//         There are several commands that the user should be able to input and that the program should store.
//         The user should be able to input a string, “copy”, “delete”, “undo” and “quit”.
//         When a user inputs a string that string should be saved into the edit history.
//         When they copy the last string stored in the edit history should be re-entered into the history.
//         When they delete the last string should be removed.
//         When they undo the last string removed should be added back into the history again.
//         And when they quit the program should terminate.


import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Stack<String> input = new Stack<>();
    private static boolean start = true;
    private static String middle =null;
    private static String middle2 =null;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Hi there! please write...");


        while (start && (input.size() <= 10)) {

            String userInput = scan.nextLine();
            input.push(userInput);

            if (userInput.equals("copy")) {
                input.pop();
                middle = input.peek();
                input.push(middle);

            } else if (userInput.equals("delete")) {
                input.pop();
                middle2=input.peek();
                input.pop();

            } else if (userInput.equals("undo")) {
                input.pop();
                input.push(middle2);

            } else if (userInput.equals("quit")){
                input.pop();
                System.out.println(input);
                break;
            }

            System.out.println(input);
        }

        System.out.println("Apps stop running by the user....");
    }

}
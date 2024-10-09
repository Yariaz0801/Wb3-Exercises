package com.pluralsight;
import java.util.Scanner;
public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String[] Quote = new String[10];
                Quote [0] = "Be yourself; everyone else is already taken. -Oscar Wilde";
                Quote [1] = "You must be the change you wish to see in the world. -Mahatma Gandhi";
                Quote [2] = "Spread love everywhere you go. Let no one ever come to you without leaving happier. -Mother Teresa";
                Quote [3] = "The only thing we have to fear is fear itself. -Franklin D. Roosevelt";
                Quote [4] = "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that. -Martin Luther King Jr.";
                Quote [5] = "Do one thing every day that scares you. -Eleanor Roosevelt";
                Quote [6] = "Well done is better than well said. -Benjamin Franklin";
                Quote [7] ="The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. -Helen Keller";
                Quote [8] = "It is during our darkest moments that we must focus to see the light. -Aristotle";
                Quote [9] = "Do not go where the path may lead, go instead where there is no path and leave a trail. -Ralph Waldo Emerson";



        String[] Quote2 = {
                "You must be the change you wish to see in the world. -Mahatma Gandhi",
                "Spread love everywhere you go. Let no one ever come to you without leaving happier. -Mother Teresa",
                "The only thing we have to fear is fear itself. -Franklin D. Roosevelt",
                "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that. -Martin Luther King Jr.",
                "Do one thing every day that scares you. -Eleanor Roosevelt",
               "Well done is better than well said. -Benjamin Franklin",
                "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart. -Helen Keller",
                "It is during our darkest moments that we must focus to see the light. -Aristotle",
               "Do not go where the path may lead, go instead where there is no path and leave a trail. -Ralph Waldo Emerson",
                "Be yourself; everyone else is already taken. -Oscar Wilde"
        };


        try {

            System.out.print("Select a number between 1 and 10: ");
            int index = scanner.nextInt();
            index--;
            System.out.println(Quote[index]);
        }
        catch (Exception e){
            System.out.println("That is invalid.  Sorry.");
            System.out.println(e.getMessage());
        }
    }
}

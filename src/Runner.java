import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String[] america = {"a verb","a noun","an adverb","a past tense noun","a plural noun","a plural noun","an adjective","a plural noun"};
        String[] dino = {"an adjective","a plural noun","a proper noun","an adjective","a noun","a noun","a noun", "a noun"};
        String[] cook = {"a noun","a noun","a verb","a noun","a noun","a noun","a noun","a noun"};
        System.out.println("Choose a category: 'Muricah, Dinosaurs, Cooking. Please enter the category exactly how it is written");
        String category = sc.nextLine();

        if(category.equals("'Muricah")){
            for(int i = 0; i < america.length; i++){
                System.out.println("Enter " + america[i]);
                words.add(sc.nextLine());
            }

            System.out.println("O say can you " + words.get(0) + " by the dawn's early " + words.get(1) + ", What so " + words.get(2) +
            " we " + words.get(3) + " at the twilight's last gleaming, Whose broad " + words.get(4) + " and bright " + words.get(5) +
            " through the " + words.get(6) + " fight, O'er the " + words.get(7) + " were so gallantly streaming");

        }else if(category.equals("Dinosaurs")){
            for(int i = 0; i < dino.length; i++){
                System.out.println("Enter " + dino[i]);
                words.add(sc.nextLine());
            }

            System.out.println("The triceratops was a dinosaur that looked " + words.get(0) + " because it had 3 " + words.get(1) +
            " on the top of its head. It used these to stay safe from enemies like " + words.get(2) + ". It was a " + words.get(3) +
            " but not the biggest. It was only 10 feet tall. That's not even as tall as a " + words.get(4) + ". It walked on 4 legs that " +
            "were as short as a " + words.get(5) + ". The triceratops' favorite food was " + words.get(6) + " but it also ate " + words.get(7));
            
        }else if(category.equals("Cooking")){
            for(int i = 0; i < cook.length; i++){
                System.out.println("Enter " + cook[i]);
                words.add(sc.nextLine());
            }

            System.out.println("First you take your " + words.get(0) + " then add a layer of " + words.get(1) + " before you " + words.get(2) +
            " on a hearty dose of " + words.get(3) + ". Next, press some " + words.get(4) + " down into the " + words.get(5) +
            " before covering with a sprinkling of " + words.get(6) + ". That's how I make a " + words.get(7) + "!");
        }
    }
}

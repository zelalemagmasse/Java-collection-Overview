package com.company;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	// write your code here
        ArrayList movies = new ArrayList();
        System.out.println("Please Enter your favorite Moves ");

        while(input.hasNext()) {
            String mv = input.nextLine();
            movies.add(mv);
            if (mv.equals("exit")) {
                break;
            }
        }
        Collections.sort(movies);
        for(Object movie: movies){
            System.out.println(movie);

        }
    }
}

package dev.tinajero;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Driver {
    
    static ArrayList<String> white = new ArrayList<String>(); // Setting an array with the available moves for white
    static ArrayList<String> black = new ArrayList<String>(); // Setting an array with available moves for black

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //scanner to take in user input

        String option;
        boolean running = true;

        while(running) {
            System.out.println("Enter the starting and ending position for the Bishop: (a1-h8)");
            String start = sc.nextLine(); //taking input for the starting position
            String end = sc.nextLine();  //taking input for the ending position
            System.out.println("Enter the amount of moves you wish to get to there");
            int moves = sc.nextInt();
            boolean result;

            start = start.toLowerCase(Locale.ROOT);
            end = end.toLowerCase(Locale.ROOT);

            chessBoard();
            result = Bishop(start, end, moves);

            System.out.println(result);
            System.out.println("Would you like to exit? Press x, else press anything else");

            sc.nextLine();

            option = sc.nextLine();
            option = option.toLowerCase(Locale.ROOT);

            if(option.equals("x")){
                running = false;
                sc.close();
            }
        }

    }
    public static boolean Bishop(String start, String end, int moves){
        int startX = start.toCharArray()[0] - 48;
        int startY = start.toCharArray()[1];
        int endX = end.toCharArray()[0] - 48;
        int endY = end.toCharArray()[1];

        if(start.equals(end)){ //if the bishop's ending position is the starting one it will return true
            return true;
        }
        if(white.contains(start) && white.contains(end) && moves >=1){ //if the bishop's start and ending are in the same color squares and is within reach return true
            return true;
        }
        if (black.contains(start) && black.contains(end) && moves >= 1){
            return true;
        }

        return false;
    }

    public static void chessBoard() {
        white.add("a2");
        white.add("a4");
        white.add("a6");
        white.add("a8");
        white.add("b1");
        white.add("b3");
        white.add("b5");
        white.add("b7");
        white.add("c2");
        white.add("c4");
        white.add("c6");
        white.add("c8");
        white.add("d1");
        white.add("d3");
        white.add("d5");
        white.add("d7");
        white.add("e2");
        white.add("e4");
        white.add("e6");
        white.add("e8");
        white.add("f1");
        white.add("f3");
        white.add("f5");
        white.add("f7");
        white.add("g2");
        white.add("g4");
        white.add("g6");
        white.add("g8");
        white.add("h1");
        white.add("h3");
        white.add("h5");
        white.add("h7");

        black.add("a1");
        black.add("a3");
        black.add("a5");
        black.add("a7");
        black.add("b2");
        black.add("b4");
        black.add("b6");
        black.add("b8");
        black.add("c1");
        black.add("c3");
        black.add("c5");
        black.add("c7");
        black.add("d2");
        black.add("d4");
        black.add("d6");
        black.add("d8");
        black.add("e1");
        black.add("e3");
        black.add("e5");
        black.add("e7");
        black.add("f2");
        black.add("f4");
        black.add("f6");
        black.add("f8");
        black.add("g1");
        black.add("g3");
        black.add("g5");
        black.add("g7");
        black.add("h2");
        black.add("h4");
        black.add("h6");
        black.add("h8");
    }
}

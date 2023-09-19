package PracticeDaily;

import java.util.Scanner;

class Guesser{
    int guessingNumber;

    int guessNum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the guessing number");
        guessingNumber= scan.nextInt();
        return guessingNumber;// guesser guessing the number and storing in mind  return bec returning to umpire

    }
}
class player{
    int guessinNumber;


    int guessthenum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("player come on enter the guessing number");
        guessinNumber= scan.nextInt();
        return guessinNumber;//player guessing the number and returning to the umpire whatever he guessed
    }
}
class umpire{
    int numfromguesser;
    int numfromplayer1;
    int numfromplayer2;
    int numfromplayer3;

    void  collectnumfromguesser(){
        Guesser g=new Guesser();
        numfromguesser=g.guessNum();//object created getting the guesser umpire wants the activity of method guessingNumber
        // umpire not returning the number to anyone so no returntype void
    }
    void collectnumfromplayer(){
        //umpire collecting the number from players and storing in variables his own
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numfromplayer1=p1.guessthenum();
        numfromplayer2=p2.guessthenum();
        numfromplayer3=p3.guessthenum();
    }
    void comparingthenum(){
        if(numfromguesser==numfromplayer1){
            if(numfromguesser==numfromplayer2 && numfromguesser==numfromplayer3){
                System.out.println("all three won the game");
            } else if (numfromguesser==numfromplayer2) {
                System.out.println("player 1 and 2 won");
            } else if (numfromguesser==numfromplayer3) {
                System.out.println("player 1 and 3 won the game");
            }else{
                System.out.println("player1 won the game");
            }

        } else if (numfromguesser==numfromplayer2) {
            if(numfromguesser==numfromplayer3){
                System.out.println("player 2 and player3 won the game");
            }else{
                System.out.println("player2 won the game");
            }

        } else if (numfromguesser==numfromplayer3) {
            System.out.println("player3 won the game");
        }
        else{
            System.out.println("noone won the game Try again");
        }
    }
}


// everything is done inside umpire to initiate the game we need to instance in main method the umpire class

public class Game {
    public static void main(String[] args) {
        umpire u= new umpire();
        u.collectnumfromguesser();
        u.collectnumfromplayer();
        u.comparingthenum();
    }
}

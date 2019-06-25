import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {



        boolean x = false;

        do {

            showMenu();

            switch (logowanie()){

                case 1:
                    user();
                    break;
                case 2:
                    userSoftlab();
                    break;
                default:
                    System.out.println("Błędny numerek ziomuś!!!");
                    break;
                case 9:
                    System.out.println("Opuszczać program PAPAPAP");
                    x=true;
                    break;

            }
        }while (x == false);
    }


    private static void showMenu(){
        System.out.println("Podaj co chcesz zrobić"+'\n'+
                "1.User terminal"+'\n'+
                "2.User Softlab"+ '\n'+
                "9.Exit");

    }

    private static int logowanie(){

        try{
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            return n;
        }catch (InputMismatchException ex) {
            System.out.println("Liczbe podaj gamoniu!!!");
            return 0;
        }
    }

    private static void user() {
        System.out.println("Login:"+" "+ login() +'\n'+ "Hasełko:" + " " + pass());
    }

    private static void userSoftlab() {
        System.out.println("GRUPA\\"+login());
    }

    private static String login(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj imie");
        String a = scan.next();
        System.out.println("Podaj nazwisko");
        String b = scan.next();
        String login;
        pass();
        if (b.length()<8)
            return  login = (a.substring(0, 1) + b);
        else
            return  login=(a.substring(0, 1) + b.substring(0, 7));
    }

    private static int pass(){
        Random pass = new Random() ;
        int c = pass.nextInt(1000)+8999;
        return c;
    }

}

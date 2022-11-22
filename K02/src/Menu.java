

import java.util.Scanner;

public class Menu {
    private int input;
    private String inputToString =  Integer.toString(input);;
    private Beer[] lagerBeer = {new Beer("Heineken", Sort.LAGER), new Beer("Calanda", Sort.LAGER), new Beer("Chopfab", Sort.LAGER)};
    private Beer[] amberBeer = {new Beer("Ittinger", Sort.AMBER), new Beer("Chopfab Amber",Sort.AMBER), new Beer("Grimbergen Amber", Sort.AMBER), new Beer("Berner muentschi", Sort.AMBER)};
    private Beer[] darkBeer = {new Beer("Schwarzer Kristall", Sort.DARK), new Beer("Chopfab Dunkel", Sort.DARK)};
    private Beer[] stoutBeer = {new Beer("Guinness", Sort.STOUT)};
    private Beer[] aleBeer = {};
    private boolean isRunning = true;
    private boolean isValidMessage = true;
    Scanner myScanner = new Scanner(System.in);

    public Menu() {
    }

    public void runner() {
        do {
            printMenu();
            try {
                this.input = Integer.parseInt(myScanner.nextLine());
                setInputToString(this.input);
                this.inputToString = getInputToString();

            } catch (NumberFormatException nfe) {
                this.isValidMessage = false;
                System.out.print("Eingabe ungueltig: ");
            }
            if (this.inputToString.length() > 0 && this.inputToString.length() < 2) {
                switch (input) {
                    case 1: {
                        printList(lagerBeer, "Lagerbier");
                        break;
                    }
                    case 2: {
                        printList(amberBeer, "Amberbier");
                        break;
                    }
                    case 3: {
                        printList(darkBeer, "Dunkelbier");
                        break;
                    }
                    case 4: {
                        printList(stoutBeer, "Stoutbier");
                        break;
                    }
                    case 5: {
                        printList(aleBeer, "Alebier");
                        break;
                    }
                    case 0: {
                        System.out.println("Programm Beenden");
                        setRunning(false);
                        break;
                    }
                    default:
                        if (this.isValidMessage) {
                            System.out.print("Eingabe ungueltig: ");
                        }
                        System.out.println("\n");
                }
            }
        } while (isRunning == true);
    }

    public void printList(Beer[] beerList, String listName){
        System.out.println("\n");
        System.out.println("----------------------");
        System.out.println(listName + ":");
        System.out.println("----------------------");
        if (beerList.length > 0) {
            for (int i = 0; i < beerList.length; i++) {
                Beer beer = beerList[i];
                System.out.println(beer.getName());
            }
            System.out.println("----------------------");
        }else{
            System.out.println("\n");
            System.out.println("Keine Eintraege gefunden");
        }
    }

    public void printMenu(){
        System.out.println("----------------------");
        System.out.println("Waehle eine Biersorte ?");
        System.out.println("----------------------");
        System.out.println(
                "1:\tLager\n" +
                        "2:\tAmber\n" +
                        "3:\tDunkel\n" +
                        "4:\tStout\n" +
                        "5:\tAle\n" +
                        "0:\tAbbruch"
        );
        System.out.println("----------------------");
    }

    public String getInputToString() {
        return inputToString;
    }

    public void setInputToString(int input) {
        String inputToString = Integer.toString(input);
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public boolean isValidMessage() {
        return isValidMessage;
    }

    public void setValidMessage(boolean validMessage) {
        isValidMessage = validMessage;
    }
}

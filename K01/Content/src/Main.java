import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int input = 9;
        String inputToString = Integer.toString(input);
        String[] lagerBiere = {"Heineken", "Calanda", "Chopfab"};
        String[] amberBiere = {"Ittinger", "Chopfab Amber", "Grimbergen Amber", "Berner muentschi"};
        String[] dunkelBiere = {"Schwarzer Kristall", "Chopfab Dunkel"};
        String[] stoutBiere = {"Guinness"};
        String[] aleBiere = {};
        boolean run = true;
        boolean isValidMessage = true;
        Scanner myScanner = new Scanner(System.in);
        while (run) {
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
            try {
                input = Integer.parseInt(myScanner.nextLine());

            } catch (NumberFormatException nfe) {
                isValidMessage = false;
                System.out.print("Eingabe ungueltig: ");

            }
            if (inputToString.length() >0 && inputToString.length() <2) {
                switch (input) {
                    case 1:
                        System.out.println("Lager:");
                        if (lagerBiere.length > 0) {
                            for (String bier : lagerBiere) {
                                System.out.println(bier);
                            }
                        } else {
                            System.out.println("Keine Eintraege gefunden");
                        }
                        break;
                    case 2:
                        System.out.println("Amber:");
                        if (amberBiere.length > 0) {
                            for (String bier : amberBiere) {
                                System.out.println(bier);
                            }
                        } else {
                            System.out.println("Keine Eintraege gefunden");
                        }
                        break;
                    case 3:
                        System.out.println("Dunkel:");
                        if (dunkelBiere.length > 0) {
                            for (String bier : dunkelBiere) {
                                System.out.println(bier);
                            }
                        } else {
                            System.out.println("Keine Eintraege gefunden");
                        }
                        break;
                    case 4:
                        System.out.println("Stout:");
                        if (stoutBiere.length > 0) {
                            for (String bier : stoutBiere) {
                                System.out.println(bier);
                            }
                        } else {
                            System.out.println("Keine Eintraege gefunden");
                        }
                        break;
                    case 5:
                        System.out.println("Ale:");
                        if (aleBiere.length > 0) {
                            for (String bier : aleBiere) {
                                System.out.println(bier);
                            }
                        } else {
                            System.out.println("Keine Eintraege gefunden");
                        }
                        break;
                    case 0:
                        System.out.println("Beenden");
                        run = false;
                        break;
                    default:
                        if (isValidMessage) {
                            System.out.print("Eingabe ungueltig: ");
                        }
                        System.out.println("\n");
                }
            } else {
                System.out.println("Die Eingabe ist zu lang");
            }
        }
    }
}
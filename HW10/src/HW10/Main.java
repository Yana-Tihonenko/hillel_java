package HW10;

import java.util.ArrayList;
import java.util.Scanner;

import static HW10.BouquetShop.countingprice;

public class Main {


    public static void main(String[] args) {
        ArrayList<Flower> flowersInBouquet;
        ArrayList<Аccessorie> accessorieInBouquet;
        Bouquet bouquet;
        BouquetShop bouquetShop = new BouquetShop();
        Scanner scan = new Scanner(System.in);
        boolean flagLevel1 = true;
        while (flagLevel1) {
            System.out.println("Choose operatons" + "\n" +
                    "1.Create Bouquet" + "\n" +
                    "2.Bouquet operations" + "\n" +
                    "3.Print Bouquets" + "\n" +
                    "0.Exit");
            switch (scan.nextInt()) {
                case (1):
                    bouquet = new Bouquet();
                    flowersInBouquet = new ArrayList<Flower>();
                    accessorieInBouquet = new ArrayList<Аccessorie>();
                    bouquet.flowersInBouquet = flowersInBouquet;
                    bouquet.accessorieInBouquet = accessorieInBouquet;
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Choose operatons" + "\n" +
                                "1.Create flower" + "\n" +
                                "2.Create accessorie" + "\n" +
                                "0.Exit");
                        switch (scan.nextInt()) {
                            case (1):
                                Flower flower = new Flower();
                                System.out.println("Inter Nаme ->");
                                scan.nextLine();
                                flower.setNameFlower(scan.nextLine());
                                System.out.println("Inter LevelFreshFlower ->");
                                flower.setLevelFreshFlower(scan.nextInt());
                                System.out.println("Inter lengthFlower ->");
                                flower.setLengthFlower(scan.nextInt());
                                System.out.println("Inter price ->");
                                flower.setPriceFlower(scan.nextInt());
                                flowersInBouquet.add(flower);
                                break;
                            case (2):
                                Аccessorie accessorie = new Аccessorie();
                                System.out.println("Inter name accessorie ->");
                                scan.nextLine();
                                accessorie.setNameАccessorie(scan.nextLine());
                                System.out.println("Inter price accessorie ->");
                                accessorie.setPriceАccessorie(scan.nextInt());
                                accessorieInBouquet.add(accessorie);
                                break;
                            case (0):
                                flag = false;
                                break;

                        }
                    }
                    break;
                case (2):
                    flag = true;
                    while (flag) {
                        System.out.println("Choose operatons" + "\n" +
                                "1.Sort flowers by level fresh" + "\n" +
                                "2.Find flowers by length" + "\n" +
                                "3.Add flowers" + "\n" +
                                "4.Add accessorie" + "\n" +
                                "0.Exit");
                        switch (scan.nextInt()) {
                            case (1):
                                //Sort flowers by level fresh
                                break;
                            case (2):
                                //Find flowers by length
                                break;
                            case (3):
                                //Add flowers
                                break;
                            case (4):
                                //countingprice
                                //countingprice(bouquet);
                                break;
                            case (5):
                                //Add accessorie

                                break;
                            case (0):
                                flag = false;
                        }
                    }
                    break;
                case (3):
                    //3.Print Bouquet
                    System.out.println("Print Bouquet");
                    System.out.println(bouquetShop.bouquetShop.get(0).accessorieInBouquet.toString());
                    break;
                case (0):
                    //Exit
                    flagLevel1 = false;
                    scan.close();
                    break;
            }
        }
    }
}
//1. Create Bouquet
/////1.1. Create flower
/////1.2. Create accessorie
/////1.3. Exit
//2.Bouquet operations
/////2.1. Sort flowers by level fresh
/////2.2. Find flowers by length
/////2.3. Add flowers
/////2.4. Add accessorie
/////2.5. Exit
//3. Print Bouquet
//4. Exit


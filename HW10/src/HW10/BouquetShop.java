package HW10;

import java.util.ArrayList;

public class BouquetShop {

     public ArrayList<Bouquet> bouquetShop;

    public BouquetShop() {

        //ArrayList <Bouquet> bouquetShop = new ArrayList();

    }

    public void sortFlowerBylevelFresh(ArrayList<Flower> flower) {
        //flower.sort();
    }

    public void findFlowerBylength() {

    }

   public static int countingprice(Bouquet bouquet ){
        int priceflowers=0, priceaccessorie=0;
        for (int  i =0; i<bouquet.flowersInBouquet.size();i++){
            priceflowers=priceflowers+bouquet.flowersInBouquet.get(i).getPriceFlower();
        }
       for (int  i =0; i<bouquet.accessorieInBouquet.size();i++){
           priceaccessorie = (int) (priceaccessorie+bouquet.accessorieInBouquet.get(i).getPriceАccessorie());
       }
        return priceflowers+priceaccessorie;
    }

 /*   public void printBouquetAll(ArrayList<BouquetShop> bouquetShop) throws Exception {
        if (bouquetShop.size() == 0) {
            throw new NullPointerException("Bouquet is null!");

        } else {
            for (int i = 0; i < bouquetShop.size(); i++) {
                bouquetShop.();
            }
            for (int i = 0; i < bouquetShop.size(); i++) {
                bouquetShop.toString();
            }
        }

    }*/

}

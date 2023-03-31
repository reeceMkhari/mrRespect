/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reece;

/**
 *
 * @author R.S MKhari
 */
public class ProductSaleTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here

        ProductSale objProdSale = new ProductSale("Respect", "shoes", 789.95, 4, false);

        double totalPrice;
        double savedAmt;
        double memberSavedAmt;
        double totalPayment;
        System.out.println("object created");
        System.out.println("data:" + objProdSale.toString());

        System.out.println("Calculating Total Price");
        totalPrice = objProdSale.CalcTotalPrice(789.95, 4);
        System.out.println("Total Price: " + totalPrice);

        System.out.println("Calculating Saved Amount");
        savedAmt = objProdSale.calcSaveAmt(totalPrice, 0.35);
        System.out.println("Total Saved Amount: " + savedAmt);

        System.out.println("Calculating Member Saved Amount");
        memberSavedAmt = objProdSale.calcMemberSaveAmt(totalPrice, 0.15, false);
        System.out.println("Total Member Saved Amount: " + memberSavedAmt);

        System.out.println("Calculating Total Payement Amount ");
        totalPayment = objProdSale.calcTotalPayment(totalPrice, savedAmt, memberSavedAmt);
        System.out.println("Total Payment Amount: " + totalPayment);

    }

}

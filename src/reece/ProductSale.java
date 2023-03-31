/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reece;

/**
 *
 * @author R.S Mkhari
 */
public class ProductSale
{

    private String customerName;
    private String productName;
    private double price;
    private int quantity;
    private boolean membership;

    public ProductSale(String customerName, String productName, double price, int quantity, boolean membership)
    {
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.membership = membership;
    }

    public void setCustomerName(String customerName)
    {
        if (customerName.length() < 3)

        {
            throw new IllegalArgumentException("Invalid Name. Name too short " + customerName);
        }

        this.customerName = customerName;
    }

    public void setProductName(String productName)
    {
        if (productName.length() < 3)

        {
            throw new IllegalArgumentException("Invalid Product Name. Name too short " + productName);
        }
        this.productName = productName;
    }

    public void setPrice(double price)
    {
        if (price <= 0)

        {
            throw new IllegalArgumentException("Invalid Price. Price cannot be 0 or less" + price);
        }

        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        if (quantity < 1)

        {
            throw new IllegalArgumentException("Invalid quantity. quantity cannot be less than 1 " + quantity);
        }
        this.quantity = quantity;
    }

    public void setMembership(boolean membership)
    {
        this.membership = membership;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public boolean isMembership()
    {
        return membership;
    }

    public double CalcTotalPrice(double price, int quanity)
    {

        double totalPrice;

        totalPrice = price * quantity;

        return totalPrice;

    }

    public double calcSaveAmt(double totalPrice, double discount)
    {

        double savedAmt = 0;

        if (quantity >= 3)

        {
            savedAmt = totalPrice * discount;
        }

        return savedAmt;

    }

    public double calcMemberSaveAmt(double totalPrice, double memberDisc, boolean isMember)
    {

        double memberSavedAmt;

        if (isMember == true)

        {
            memberSavedAmt = totalPrice * memberDisc;
        }
        else
        {
            memberSavedAmt = 0;
        }

        return memberSavedAmt;

    }

    public double calcTotalPayment(double totalPrice, double savedAmt, double memberSavedAmt)
    {

        double totalPayment = 0;

        if ((quantity >= 3) && (membership == true))

        {
            totalPayment = totalPrice - (savedAmt + memberSavedAmt);
        }
        else

        {
            totalPayment = totalPrice - savedAmt;
        }

        return totalPayment;
    }

    @Override

    public String toString()
    {
        return "customer Name: " + customerName + " \n" + "product Name: " + productName + "\n" + "price: " + price + "\n" + "quantity: " + quantity + "\n" + "membership: " + membership;
    }

}

package TB2_second_term.week_10.Ex1_p1;

public class Customer
{
    private String name;
    private double balance;
    private double discount = 1;

    public double getDiscountedBalance()
    {
        return this.getBalance() / this.getDiscount();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setDiscount(double discount)
    {
        this.discount = discount;
    }

    public double getDiscount()
    {
        return this.discount;
    }

}
package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingPrice;
    private int bagPrice;

    private boolean Ischeese , Istopping,Isbag, Isbill ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
            this.toppingPrice= 70;
        }else{this.price = 400;
            this.toppingPrice= 120;
        }
        this.cheesePrice=80;

        this.bagPrice=20;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(Ischeese==false){
            price = price + cheesePrice;
            Ischeese=true;
        }

        // your code goes here
    }

    public void addExtraToppings(){
        if(Istopping==false){
            price = price + toppingPrice;
            Istopping = true;
        }

        // your code goes here
    }

    public void addTakeaway(){
        if(Isbag==false){
            price = price + bagPrice;
            Isbag = true;
        }


        // your code goes here
    }

    public String getBill(){
        if(Isbill==false) {
            if (Ischeese) {
                bill = bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
            }
            if (Istopping) {
                bill = bill + "Extra Toppings Added: " + this.toppingPrice + "\n";
            }
            if (Isbag) {
                bill = bill + "Paperbag Added: " + this.bagPrice + "\n";
            }
            bill = bill + "Total Price: "+this.price+ "\n";

            Isbill = true;
        }

        // your code goes here
        return this.bill;
    }
}

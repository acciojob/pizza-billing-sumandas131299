package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg,addcheese=true,addtopping=true,addtake=true;
    private String bill;



    public Pizza(Boolean isVeg){
        if(isVeg==true){
            this.price+=300;
        }else{
            this.price+=400;
        }
        this.isVeg = isVeg;

    }

    public int getPrice(){

            return this.price;
    }

    public void addExtraCheese(){
        if(addcheese){
            this.price+=80;
            addcheese=false;
        }
    }

    public void addExtraToppings(){
        if(addtopping){
            this.price+=70;
            addtopping=false;
        }    }

    public void addTakeaway(){
        if(addtake){
            this.price+=70;
            addtake=false;
        }
    }


    public String getBill(){
        if(isVeg){
            System.out.println("Base Price Of The Pizza: "+300);
        }else {
            System.out.println("Base Price Of The Pizza: "+400);
        }
        if(!addcheese){
            System.out.println("Extra Cheese Added: "+80);
        }

        if (!addtopping){
            System.out.println("Extra Toppings Added: "+70);
        }
        if(!addtake){
            System.out.println("Paperbag Added: "+20);
        }
        System.out.println("Total Price: "+price);
        return " ";
    }
}

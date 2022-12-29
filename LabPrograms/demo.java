
enum fruits {apple(100,5),orange(60,6),watermelon(25,7); //by default its public static final.
 private double price;
 private int sweetness;

  fruits(double p, int s){
    this.price=p;
    this.sweetness=s;
 }

 double getprice(){
    return(this.price);
}

 double getsweetness()
{
    return(this.sweetness);
}
}

public class demo {
public static void main(String args[]){
    fruits f = fruits.orange;
    System.out.println(f);
    f = fruits.apple;
    System.out.println(f);

    for(fruits i : fruits.values())
       System.out.print(" "+i+",");

    System.out.println("\n");
    System.out.println(fruits.valueOf("orange"));

    for(fruits i: fruits.values())
    {
        System.out.print("Index:" + i.ordinal());
        System.out.print(" "+i);
        System.out.print(" "+i.getprice());
        System.out.println(" "+i.getsweetness());
        System.out.println("\n");
    }

    switch(f){

        case apple : System.out.println("I ordered apple");
                     break;
        case orange : System.out.println("I ordered orange");
                      break;
        case watermelon : System.out.println("I ordered watermelon");
                          break;
        default :   System.out.println("Error");
                    break; 
    }
}    
}    


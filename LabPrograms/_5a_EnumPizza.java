enum size { REGULAR,MEDIUM,LARGE,EXTRALARGE}


class test{
    size PizzaSize;

    test(size PizzaSize){
        this.PizzaSize = PizzaSize;
    }

    public void OrderPizza(){
     
        switch(PizzaSize)
        {
            case REGULAR : System.out.println("You have ordered Regular pizza");
                           break;
            
            case MEDIUM : System.out.println("You have ordered a medium pizza");
                           break;

            case LARGE  : System.out.println("You have ordered Large pizza");
                           break;  

            case EXTRALARGE : System.out.println("You have ordered Extra Large pizza");
                              break; 
                    
            default : System.out.println("You have ordered nothing.");
                      break;
        }
    }   
}


public class _5a_EnumPizza {
    public static void main(String args[]){
        test LetsOrder = new test(size.EXTRALARGE);
        LetsOrder.OrderPizza();
    }
}
package home;

import java.util.ArrayList;
import java.util.List;

import home.Restaurent.RestaurentBuilder;

public class TestBuilderPattern {

    static String name="baishno dhaba";
    static List<String> items=new ArrayList<String>();
    
    public static void main(String[] args){
        int count =0;
        items.add("tea");
        items.add("lacha prantha");
        items.add("kulcha channa");
        items.add("redbull");
        
        Restaurent dhaba=new Restaurent.RestaurentBuilder(name,items).setParkingServiceEnabled(true).build();

        System.out.println("~~~~~~~~~ WELCOME TO VAISHNO DHABA~ ~ ~ ~ ~ ~ ~");
        for(String item:dhaba.getMenu()){
            
            System.out.println(" dhaba item "+count+" "+item);
        }

    }
    

}

package home;

import java.lang.annotation.Retention;
import java.util.List;

public class Restaurent{

    private String name;
    private List<String> food_menu;
    
    
    //optional parameters


    private boolean is_room_service_available;
    private boolean is_parking_service_available;


    public List<String> getMenu(){
        return this.food_menu;
    }

    public String getName(){
        return this.name;
    }

    public boolean isRoomServiceAvailable(){
        return this.is_room_service_available;
    }

    public boolean isParkingServiceAvailable(){
        return this.is_parking_service_available;
    }


    private Restaurent(RestaurentBuilder builder){
        this.food_menu=builder.food_menu;
        this.name=builder.name;
        this.is_parking_service_available=builder.is_parking_service_available;
        this.is_room_service_available=builder.is_room_service_available;
    }

    public static class RestaurentBuilder{

        private String name;
        private List<String> food_menu;

        //optional 
        private boolean is_room_service_available;
        private boolean is_parking_service_available;

        public RestaurentBuilder(String name,List<String> menu_items){

            this.name=name;
            this.food_menu=menu_items;
        }

        public RestaurentBuilder setRoomServiceEnabled(boolean is_room_service_avail){

            this.is_room_service_available=is_room_service_avail;
            return this;
        }

        public RestaurentBuilder setParkingServiceEnabled(boolean is_parking_service_avail){
            this.is_parking_service_available=is_parking_service_avail;
            return this;
        }

    
        public Restaurent build(){
            return new Restaurent(this);
        }


    }


}
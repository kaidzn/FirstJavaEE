package kz.javaee.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Items> items = new ArrayList<>();

    private static Long id = 5L;

    static {
        items.add(new Items(1L,"Iphone XR", 640000,15));
        items.add(new Items(2L,"Samsung A51", 120000,46));
        items.add(new Items(3L,"OPPO A54", 145000,27));
        items.add(new Items(4L,"Iphone 13 Pro", 750000,30));
    }

    public static void addItem(Items item){

        item.setId(id);
        items.add(item);
        id++;

    }

    public static ArrayList<Items> getItems(){
        return items;
    }




}

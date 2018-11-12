/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogorder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krester
 */
public class CatalogOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List CatalogList = new ArrayList<FlowerCatalog>();
        
        CatalogList.add(0, new FlowerCatalog("FC001", "MoonDance Floribunda", "2007 All-American Rose Selections. This gorgeous floribunda is as ethereal and lovely as its name suggests, offering large trusses of creamy white flowers that create a striking contrast against the very glossy, dark green foliage.", "Available"));
        CatalogList.add(1, new FlowerCatalog("FC002", "Sally Holmes", "'Sally Holmes' is the winner of countless awards, and rightly so! With large blooms and enticing fragrance, it's no wonder why this is one of the most popular roses of all time.", "Available"));
        CatalogList.add(2, new FlowerCatalog("FC003", "White Drift Rose", "Almost without trying, White Drift® excels in all arenas of the garden. Like the first glistening snowfall of winter, this indulgent miniature rose fills us with childlike wonder with its radiant double blooms.", "Available"));
        
        CatalogList.get(0);
        CatalogList.get(1);
        CatalogList.get(2);
    }
    
}

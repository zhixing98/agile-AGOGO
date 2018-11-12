/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogorder;

/**
 *
 * @author Krester
 */
public class FlowerCatalog {

    String flower_id;
    String flower_name;
    String flower_description;
    String flower_status;

    public FlowerCatalog(String flower_id, String flower_name, String flower_description, String flower_status) {
        this.flower_id = flower_id;
        this.flower_name = flower_name;
        this.flower_description = flower_description;
        this.flower_status = flower_status;
    }

    public String getFlower_id() {
        return flower_id;
    }

    public String getFlower_name() {
        return flower_name;
    }

    public String getFlower_description() {
        return flower_description;
    }

    public String getFlower_status() {
        return flower_status;
    }

    public void setFlower_id(String flower_id) {
        this.flower_id = flower_id;
    }

    public void setFlower_name(String flower_name) {
        this.flower_name = flower_name;
    }

    public void setFlower_description(String flower_description) {
        this.flower_description = flower_description;
    }

    public void setFlower_status(String flower_status) {
        this.flower_status = flower_status;
    }

    @Override
    public String toString() {
        return "FlowerCatalog{" + "flower_id=" + flower_id + ", flower_name=" + flower_name + ", flower_description=" + flower_description + ", flower_status=" + flower_status + '}';
    }
    
    
    
    
   
}

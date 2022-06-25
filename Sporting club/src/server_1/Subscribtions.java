/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_1;
import java.io.Serializable;
/**
 *
 * @author Mohamed Fayez
 */
public class Subscribtions implements Serializable {
    public int subscribtion_value;
    public String sport_name;
    
    public Subscribtions(String sport_name ,int subscribtion_value)
    {
        this.subscribtion_value= subscribtion_value;
        this.sport_name=sport_name;
    }
    
}

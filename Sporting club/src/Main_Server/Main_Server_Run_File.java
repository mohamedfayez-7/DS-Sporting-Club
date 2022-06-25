/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Server;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Mohamed Fayez
 */
public class Main_Server_Run_File {
   public static void main(String[] args) throws Exception{
        Main_Server_Application server = new Main_Server_Application() ;
        Registry port = LocateRegistry.createRegistry(2500);
        port.bind("Port", server);
        System.out.println ("Program is at port 2500");    
      
    }
    
}

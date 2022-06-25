/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Server;
import java.rmi.Remote;
import java.rmi.RemoteException;
import server_1.Server_Interface;
import java.util.ArrayList;
import server_1.Subscribtions;

/**
 *
 * @author Mohamed Fayez
 */
public interface Main_Server_Interface extends Remote{

    public void Subscribe(Server_Interface subscriber_message) throws RemoteException;
    public void update_menu(ArrayList<Subscribtions> server_menu)throws RemoteException;
 
}

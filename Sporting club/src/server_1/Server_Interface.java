/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;



/**
 *
 * @author Mohamed Fayez
 */
public interface Server_Interface extends Remote{
    public void send_menu(ArrayList <Subscribtions> send) throws RemoteException;
    public void accept_server_menu (ArrayList<Server_Interface> send) throws RemoteException;
    public void accept_sports(ArrayList <Subscribtions> send) throws RemoteException;
    public ArrayList<Subscribtions> call_array()throws RemoteException;
}

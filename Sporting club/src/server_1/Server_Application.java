/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_1;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;
import Main_Server.Main_Server_Interface;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mohamed Fayez
 */
public class Server_Application extends UnicastRemoteObject implements Server_Interface{
    public  ArrayList<Server_Interface> servers;
    Main_Server_Interface server;
    public ArrayList<Subscribtions> sports;
    Registry port = LocateRegistry.getRegistry("localhost",2500);
    
    public Server_Application () throws RemoteException , NotBoundException
    {
        servers = new ArrayList<>();
        sports = new ArrayList<>();
        server = (Main_Server_Interface)port.lookup("Port");
        server.Subscribe(this);
    }
    
    @Override
    public void send_menu(ArrayList<Subscribtions> send) throws RemoteException{ 
        server.update_menu(send);

        servers.forEach((server_interface) -> {
            try {
                server_interface.accept_sports(send);
            } catch (RemoteException ex) {
                Logger.getLogger(Server_Application.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
     
    @Override
    public void accept_server_menu(ArrayList<Server_Interface> send) throws RemoteException {
        servers = send;
    }

    
    @Override
    public void accept_sports(ArrayList<Subscribtions> send) throws RemoteException {
        sports = send;
    }

    
    @Override
    public ArrayList<Subscribtions> call_array() throws RemoteException {
        return sports;
    }
    
}

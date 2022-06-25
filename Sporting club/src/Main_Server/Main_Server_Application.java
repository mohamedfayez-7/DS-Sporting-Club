/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Server;
import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import server_1.Subscribtions;
import server_1.Server_Interface;


/**
 *
 * @author Mohamed Fayez
 */
public  class Main_Server_Application extends UnicastRemoteObject implements Main_Server_Interface {
    public ArrayList<Server_Interface>servers;
    public ArrayList<Subscribtions>sports;
    public Main_Server_Application () throws RemoteException {
        servers= new ArrayList<>();
        sports = new ArrayList<>();
        sports.add(new Subscribtions("Football",500));
        sports.add(new Subscribtions("Basketball",300));
        sports.add(new Subscribtions("Handball",400));
    
    }
    
    @Override
    public void Subscribe (Server_Interface server) throws RemoteException
    {
        servers.add(server);
        server.accept_sports(sports);
        servers.forEach((serverinterface) -> {
            try {
                serverinterface.accept_server_menu(servers);
            } catch (RemoteException ex) {
                Logger.getLogger(Main_Server_Application.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    @Override
    public void update_menu(ArrayList<Subscribtions> server_menu) throws RemoteException {
        sports=server_menu; //To change body of generated methods, choose Tools | Templates.
    }
   





}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfs.ControllerImplementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import gfs.controllers.GarmentController;
import gfc.models.Garment;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gimhani Uthpala
 */
public class GarmentControllerImple extends UnicastRemoteObject implements gfc.controller.GarmentController{
    private final GarmentController garmentController;

    public GarmentControllerImple() throws RemoteException {
        super();
        this.garmentController = new GarmentController();
    }

    @Override
    public ArrayList<Garment> getSimilarGarmentNames(String item) throws RemoteException, SQLException, ClassNotFoundException {
        return garmentController.getSimilarGarmentNames(item);
    }
    @Override
    public int getStockInHand(String garment_id) throws RemoteException, SQLException, ClassNotFoundException {
        return garmentController.getStockInHand(garment_id);
    }

    @Override
    public Garment searchGarment(String garment_id) throws RemoteException, SQLException, ClassNotFoundException {
        return garmentController.searchGarment(garment_id);
    }

    @Override
    public String getLastGarmentId() throws RemoteException, SQLException, ClassNotFoundException {
        return garmentController.getLastGarmentId();
    }

    @Override
    public int addNewGarment(Garment garment) throws RemoteException, SQLException, ClassNotFoundException {
        return garmentController.addNewGarment(garment);
    }

    @Override
    public int updateGarmentStipends(Garment garment) throws RemoteException, SQLException, ClassNotFoundException {
        return garmentController.updateGarmentStipends(garment);
    }

    @Override
    public int updateGarmentStock(Garment garment) throws RemoteException, SQLException, ClassNotFoundException {
        return garmentController.updateGarmentStock(garment);
    }

    
}

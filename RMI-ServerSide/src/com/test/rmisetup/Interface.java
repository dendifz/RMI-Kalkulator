package com.test.rmisetup;

import java.rmi.*;

public interface Interface extends Remote {
	public int pertambahan(int a, int b) throws RemoteException;

	public int pengurangan(int a, int b) throws RemoteException;

	public int perkalian(int a, int b) throws RemoteException;

	public double pembagian(double a, double b) throws RemoteException;
}
package com.test.rmisetup;

import java.rmi.*;
import java.rmi.server.*;

public class Addition extends UnicastRemoteObject implements Interface {

	public Addition() throws RemoteException {
	}

	public int pertambahan(int a, int b) throws RemoteException {
		int result = a + b;
		return result;
	}

	public int pengurangan(int a, int b) throws RemoteException {
		int result = a - b;
		return result;
	}

	public int perkalian(int a, int b) throws RemoteException {
		int result = a * b;
		return result;
	}

	public double pembagian(double a, double b) throws RemoteException {
		double result = a / b;
		return result;
	}
}

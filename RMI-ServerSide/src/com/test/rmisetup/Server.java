package com.test.rmisetup;

import java.io.IOException;
import java.rmi.*;

public class Server {

	public static void main(String[] argv) throws IOException {

		Runtime.getRuntime()
				.exec("cmd /c start cmd.exe /K \"cd bin && echo Server Sudah Berjalan && start rmiregistry\"");

		try {
			Addition Receive = new Addition();
			Naming.rebind("rmi://localhost/ABC", Receive);

			System.out.println("Addition Server is ready.");
		} catch (Exception e) {
			System.out.println("Addition Server failed: " + e);
		}
	}
}
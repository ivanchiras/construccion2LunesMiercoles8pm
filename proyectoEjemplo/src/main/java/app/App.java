package app;

import app.controller.AdminController;
import app.controller.ControllerInterface;
import app.controller.SellerController;
import app.controller.Utils;

public class App {

	public static void main(String[] args) {
		ControllerInterface controllerAdmin = new AdminController();
		ControllerInterface controllerSeller = new SellerController();
		try {
			while (true) {
				System.out.println(" 1. para administrador \n 2. para vendedor\n");
				String option = Utils.getReader().nextLine();
				switch (option) {
				case "1": {
					controllerAdmin.session();
					break;
				}
				case "2": {
					controllerSeller.session();
					break;
				}
				default: {
					return;
				}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

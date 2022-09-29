package org.thoughts.on.java.coffee;

import java.util.HashMap;
import java.util.Map;

public class CoffeeApp {
	public static void main(String[] args) {

		// CREATE A MAP OF DIFFERENT COFFEE BEANS
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
		beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("My favorite espresso bean", 1000));
		beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("My favorite filter coffee bean", 1200));
		beans.put(CoffeeSelection.CAPPUCCINO, new CoffeeBean("My favorite cappuccino coffee bean", 1500));

		// CREATE A COFFEE MACHINE
//		BasicCoffeeMachine machine = new BasicCoffeeMachine(beans); // superclass referenced as the superclass
//		PremiumCoffeeMachine machine = new PremiumCoffeeMachine(beans); // subclass referenced as the subclass
//		BasicCoffeeMachine machine = new PremiumCoffeeMachine(beans); // subclass referenced as the superclass
		BasicCoffeeMachine machine = new LatteCoffeeMachine(beans); // subclass referenced as the superclass

		// BREW A FRESH COFFEE
		try {
			Coffee coffee = machine.brewCoffee(CoffeeSelection.CAPPUCCINO); // try ESPRESSO with PremiumCoffeeMachine and CAPPUCCINO with LatteCoffeeMachine
			System.out.println("Coffee selection " + coffee.getSelection().name() + " is ready!");
		} catch (CoffeeException e) {
			e.printStackTrace();
		}

	}
}

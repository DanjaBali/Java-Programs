package org.thoughts.on.java.coffee;

import java.util.Map;

public class LatteCoffeeMachine extends BasicCoffeeMachine {

	public LatteCoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) {
		// call constructor in superclass
		super(beans);

		// add configuration to brew cappuccino
		this.configMap.put(CoffeeSelection.CAPPUCCINO, new Configuration(15, 50));
	}

	private Coffee brewCappuccino() {
		Configuration config = configMap.get(CoffeeSelection.CAPPUCCINO);

		// grind the coffee beans
		GroundCoffee groundCoffee = this.grinder.grind(
				this.beans.get(CoffeeSelection.CAPPUCCINO),
				config.getQuantityCoffee());

		// brew an cappuccino
		return this.brewingUnit.brew(CoffeeSelection.CAPPUCCINO, groundCoffee,
				config.getQuantityWater());
	}

	public Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException {
		if (selection == CoffeeSelection.CAPPUCCINO)
			return brewCappuccino();
		else
			return super.brewCoffee(selection);
	}
}

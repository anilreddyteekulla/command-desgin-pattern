
public class ClientCommandTest {

	public static void main(String[] args) {

		StuffedAnimal stuffedAnimal = new StuffedAnimal("Tall Brown Bear", "32 Inch");

		FabricCuttingCommand fabricCuttingTask = new FabricCuttingCommand(stuffedAnimal);
		DollSewingCommand dollSewingTask = new DollSewingCommand(stuffedAnimal);
		CottonFillingCommand cottonFillingTask = new CottonFillingCommand(stuffedAnimal);
		DollPackingCommand dollPackingTask = new DollPackingCommand(stuffedAnimal);

		StuffedDollControllerMachine stuffedDollControllerMachine = new StuffedDollControllerMachine();
		stuffedDollControllerMachine.placeTask(fabricCuttingTask);
		stuffedDollControllerMachine.placeTask(dollSewingTask);
		stuffedDollControllerMachine.placeTask(cottonFillingTask);
		stuffedDollControllerMachine.placeTask(dollPackingTask);

		stuffedDollControllerMachine.executeTasks();

		System.out.println("\n");

		StuffedAnimal stuffedAnimal2 = new StuffedAnimal("Big Black Elephant", "34 Inch");

		FabricCuttingCommand fabricCuttingTask1 = new FabricCuttingCommand(stuffedAnimal2);
		DollSewingCommand dollSewingTask1 = new DollSewingCommand(stuffedAnimal2);
		CottonFillingCommand cottonFillingTask1 = new CottonFillingCommand(stuffedAnimal2);
		DollPackingCommand dollPackingTask1 = new DollPackingCommand(stuffedAnimal2);

		StuffedDollControllerMachine stuffedDollControllerMachine2 = new StuffedDollControllerMachine();
		stuffedDollControllerMachine2.placeTask(fabricCuttingTask1);
		stuffedDollControllerMachine2.placeTask(dollSewingTask1);
		stuffedDollControllerMachine2.placeTask(cottonFillingTask1);
		stuffedDollControllerMachine2.placeTask(dollPackingTask1);

		stuffedDollControllerMachine2.executeTasks();

	}

}

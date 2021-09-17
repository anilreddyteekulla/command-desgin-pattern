


public class FabricCuttingCommand implements Command {

	private StuffedAnimal stuffedAnimal;

	public FabricCuttingCommand(StuffedAnimal stuffedAnimal) {
		this.stuffedAnimal = stuffedAnimal;
	}

	@Override
	public void execute() {
		stuffedAnimal.fabricLaserCutting();
	}

}

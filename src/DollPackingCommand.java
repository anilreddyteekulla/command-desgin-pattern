
public class DollPackingCommand implements Command {

	private StuffedAnimal stuffedAnimal;

	public DollPackingCommand(StuffedAnimal stuffedAnimal) {
		this.stuffedAnimal = stuffedAnimal;
	}

	@Override
	public void execute() {
		stuffedAnimal.dollPacking();
	}

}

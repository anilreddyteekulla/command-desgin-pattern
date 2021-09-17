
public class DollSewingCommand implements Command {

	private StuffedAnimal stuffedAnimal;

	public DollSewingCommand(StuffedAnimal stuffedAnimal) {
		this.stuffedAnimal = stuffedAnimal;
	}

	@Override
	public void execute() {
		stuffedAnimal.dollSewing();
	}

}

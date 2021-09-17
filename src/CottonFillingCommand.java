
public class CottonFillingCommand implements Command {

	private StuffedAnimal stuffedAnimal;

	public CottonFillingCommand(StuffedAnimal stuffedAnimal) {
		this.stuffedAnimal = stuffedAnimal;
	}

	@Override
	public void execute() {
		stuffedAnimal.dollCottonFilling();
	}

}

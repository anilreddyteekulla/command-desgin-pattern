
import java.util.ArrayList;
import java.util.List;

/**
 * this is invoker
 */

public class StuffedDollControllerMachine {

	List<Command> tasks = new ArrayList<>();

	public void placeTask(Command task) {
		tasks.add(task);
	}

	public void executeTasks() {
		tasks.forEach(task -> task.execute());
		tasks.clear();
	}

}

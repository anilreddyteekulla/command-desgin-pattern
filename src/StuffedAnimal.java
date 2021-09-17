
public class StuffedAnimal {

	private String name;

	private String size;

	public StuffedAnimal(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}

	public void fabricLaserCutting() {
		System.out.println(String.format("Stuffed Animal %s of size %s Fabric Cutting done", name, size));

	}

	public void dollSewing() {
		System.out.println(String.format("Stuffed Animal %s of size %s Sewing done", name, size));

	}

	public void dollCottonFilling() {
		System.out.println(String.format("Stuffed Animal %s of size %s Cotton Filling done", name, size));

	}

	public void dollPacking() {
		System.out.println(String.format("Stuffed Animal %s of size %s Packing done", name, size));
	}
}

public class Dembo implements<Dembo> {
    int id;

	public Dembo(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dembo [id=" + id + "]";
	}

	@Override
	public int compareTo(Dembo d) {
		return this.id - d.id;
	}
}

public class AgeCheckForVoting extends RuntimeException {
	private String message;

	AgeCheckForVoting(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}
public class CheckVoteAge {
	static void checking(int age) throws AgeCheckForVoting {
		if (age >= 18) {
			System.out.println("You are validated");
		} else {
			throw new AgeCheckForVoting("You are a minor .......");
		}
	}

	public static void main(String[] args) {
		try {
			checking(15);
		} catch (AgeCheckForVoting e) {
			System.out.println(e);
//			e.printStackTrace();
		}
	}
}


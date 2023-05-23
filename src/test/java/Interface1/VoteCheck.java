package Interface1;

public class VoteCheck implements VotingRules,VotingRules2 {

	public void driverlicense() {
		System.out.println("should have valid driver licence");
		
	}

	public void validaadhar() {
		System.out.println("should have valid aadhar");
		
	}

	public void wearmask() {
		System.out.println("should weaar mask");
		
	}

	public void agelimit() {
	System.out.println("Age should be greater than 18");
		
	}

}

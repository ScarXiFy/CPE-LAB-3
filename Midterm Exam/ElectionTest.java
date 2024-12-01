
public class ElectionTest
{
	public static void main(String[] args)
	{
	    Candidate candidate1 = new Candidate("Johnson", 5000);
	    Candidate candidate2 = new Candidate("Miller", 4000);
	    Candidate candidate3 = new Candidate("Duffy", 6000);
	    Candidate candidate4 = new Candidate("Robinson", 2500);
	    Candidate candidate5 = new Candidate("Ashton", 1800);

	    Election election = new Election(candidate1, candidate2, candidate3, candidate4, candidate5);

	    election.displayResults();
	}

}

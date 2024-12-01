
public class Election
{
    private Candidate[] candidates = new Candidate[5];

    public Election()
    {
        for (int i = 0; i < candidates.length; i++)
        {
            candidates[i] = new Candidate();
        }
    }

    public Election(Candidate... candidates)
    {
        if (candidates.length == 5) {
            this.candidates = candidates;
        } else {
            throw new IllegalArgumentException("Exactly 5 candidates are required.");
        }
    }

    public int calculateTotalVotes()
    {
        int totalVotes = 0;
        for (Candidate candidate : candidates)
        {
            totalVotes += candidate.getVotes();
        }
        return totalVotes;
    }

    public double[] calculatePercentageOfVotes()
    {
        int totalVotes = calculateTotalVotes();
        double[] percentages = new double[candidates.length];
        for (int i = 0; i < candidates.length; i++)
        {
            if (totalVotes > 0)
            {
                percentages[i] = (candidates[i].getVotes() * 100.0) / totalVotes;
            } else
            {
                percentages[i] = 0.0;
            }
        }
        return percentages;
    }

    public String determineWinner()
    {
        Candidate winner = candidates[0];
        for (Candidate candidate : candidates)
        {
            if (candidate.getVotes() > winner.getVotes())
            {
                winner = candidate;
            }
        }
        return winner.getName();
    }

    public void displayResults() {
        double[] percentages = calculatePercentageOfVotes();
        int totalVotes = calculateTotalVotes();

        System.out.println("Candidate       Votes Received       % of Total Votes");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < candidates.length; i++) {
            System.out.printf("%-15s %-20d %-10.2f%%\n",
                    candidates[i].getName(), candidates[i].getVotes(), percentages[i]);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("%-15s %-20d\n", "Total", totalVotes);

        System.out.println("\nThe Winner of the Election is " + determineWinner() + ".");
    }

}

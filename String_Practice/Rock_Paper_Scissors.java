import java.util.*;
class Rock_Paper_Scissors
{
    static int userWins = 0, compWins = 0, draws = 0;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        String[][] results = new String[games][3];

        for (int i = 0; i < games; i++)
        {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;

            if (winner.equals("User")) 
            {
                userWins++;
            }
            else if (winner.equals("Computer")) 
            {
                compWins++;
            }
            else 
            {
                draws++;
            }
        }

        displayResults(results);
    }

    public static String getComputerChoice()
    {
        double rand = Math.random();
        if (rand < 0.33) 
        {
            return "rock";
        }
        else if (rand < 0.66) 
        {
            return "paper";
        }
        else 
        {
            return "scissors";
        }
    }

    public static String findWinner(String user, String comp)
    {
        if (user.equals(comp))
        {
            return "Draw";
        }
        if (user.equals("rock") && comp.equals("scissors")) 
        {
            return "User";
        }
        if (user.equals("scissors") && comp.equals("paper")) 
        {
            return "User";
        }
        if (user.equals("paper") && comp.equals("rock")) 
        {
            return "User";
        }
        return "Computer";
    }

    public static void displayResults(String[][] results)
    {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++)
        {
            System.out.println((i+1) + "\t" + results[i][0] + "\t " + results[i][1] + "\t  " + results[i][2]);
        }

        int total = userWins + compWins + draws;
        double userPercent = (userWins * 100.0) / total;
        double compPercent = (compWins * 100.0) / total;

        System.out.println("\nSummary:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        System.out.println("User Win Percentage: " + String.format("%.2f", userPercent) + "%");
        System.out.println("Computer Win Percentage: " + String.format("%.2f", compPercent) + "%");
    }
}

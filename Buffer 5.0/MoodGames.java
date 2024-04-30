import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MoodGames {
    public static void main(String[] args) {
        // Initialize mood-wise game suggestions
        HashMap<String, List<String>> moodGames = new HashMap<>();
        
        // Add games for each mood
        moodGames.put("happy", List.of(
             "Happy Wheels"
        ));
        moodGames.put("sad", List.of(
            "Mini Metro"
        ));
        moodGames.put("confused", List.of(
             "2048"
        ));
        moodGames.put("frustrated", List.of(
             "Cut the Rope"
        ));
        moodGames.put("fear", List.of(
            "Plants vs. Zombies"
        ));
        moodGames.put("other", List.of(
             "Doodle Jump", "Bejeweled"
        ));
        // Prompt user to select mood
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Select your mood:");
            System.out.println("1. Happy");
            System.out.println("2. Sad");
            System.out.println("3. Confused");
            System.out.println("4. Frustrated");
            System.out.println("5. Fear");
            System.out.println("6. Other");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String mood = "";
            switch (choice) {
                case 1:
                    mood = "happy";
                    System.out.println("Its fantastic to see your happiness shining through!");
                    System.out.println("Here is the game that you can enjoy...");
                    break;
                case 2:
                    mood = "sad";
                    System.out.println("No worries, I am here for you!!");
                    System.out.println("Here is the game that you can enjoy...");
                    break;
                case 3:
                    mood = "confused";
                    System.out.println("Confusion is just a temporary state, here you will find your way through the fog >>>");
                    System.out.println("Here is the game that you can enjoy...");
                    break;
                case 4:
                    mood = "frustrated";
                    System.out.println("I understand how frustating that must be.");
                    System.out.println("Here is the game that you can enjoy...");
                    break;
                case 5:
                    mood = "fear";
                    System.out.println("It's ok to feel afraid. Remember, you are not alone, you have your loved ones !");
                    System.out.println("Here is the game that you can enjoy...");
                    break;
                case 6:
                    mood = "other";
                    System.out.println("Here are some games that you can enjoy...");
                    break;
                case 7:
                    System.out.println("Exiting...");
                   
                    return;
                default:
                    System.out.println("Try Again");
                    continue;
            }

            // Check if mood is valid and suggest games
            if (moodGames.containsKey(mood)) {
                List<String> suggestedGames = moodGames.get(mood);
                for (String game : suggestedGames) {
                    System.out.println("- " + game + ": " + getGameLink(game));
                }
            } else {
                System.out.println("Sorry, we don't have game suggestions for that mood.");
            }
        }
    }

    // Function to get the link for each game
    public static String getGameLink(String gameName) {
        switch (gameName) {
            case "Sushi Cat":
                return "https://play.google.com/store/apps/details?id=com.abi.sushi.cat.tycoon&pcampaignid=web_share";
            case "Cookie Clicker":
                return " https://play.google.com/store/apps/details?id=org.dashnet.cookieclicker&pcampaignid=web_share";
            case "Mini Metro":
                return "https://play.google.com/store/apps/details?id=nz.co.codepoint.minimetro&pcampaignid=web_share";
            case "Doodle Jump":
                return " https://play.google.com/store/apps/details?id=com.lima.doodlejump&pcampaignid=web_share";
            case "Cut the Rope":
                return "https://play.google.com/store/apps/details?id=com.zeptolab.ctr.ads&pcampaignid=web_share";
            case "Plants vs. Zombies":
                return " https://play.google.com/store/apps/details?id=com.ea.game.pvzfree_row&pcampaignid=web_share";
            case "Happy Wheels":
                return "https://www.totaljerkface.com/happy_wheels.tjf";
            case "Bejeweled":
                return " https://play.google.com/store/apps/details?id=com.ea.gp.bej3&pcampaignid=web_share";
            case "Paper.io":
                return "https://play.google.com/store/apps/details?id=io.voodoo.paper2&pcampaignid=web_share";
            case "2048":
                return "https://play.google.com/store/apps/details?id=com.androbaby.game2048&pcampaignid=web_share";
            default:
                return "No link available";
        }
    }
}
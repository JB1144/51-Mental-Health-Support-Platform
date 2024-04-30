import java.util.*;

class Graph {
  private Map<Integer, List<String>> recommendations;

    public Graph() {
     recommendations = new HashMap<>();
   recommendations.put(-1, Arrays.asList("Meditation : https://youtu.be/ztTexqGQ0VI?feature=shared","Exercise :https://youtu.be/sFtP0HWvu0k?si=EasWyFO6mJ0mlLuY","Podcast : https://youtu.be/VlDgowUAyx4?si=fbI9YWuYR9RlTJvs")); // Low score recommendations
       recommendations.put(0, Arrays.asList("Meditation : https://youtu.be/VDLfVwMSbJ8?si=n4vuKw_4Rxpe9R0R", "Exercise : https://youtu.be/J3hxjdyYC1U?feature=shared","Podcast : https://youtu.be/xsEJ6GeAGb0?si=8GKv03NWTVTKxb-S")); // Medium score recommendations
     recommendations.put(1, Arrays.asList("Sound therapy:https://youtu.be/VgdAcENXy84?feature=shared", "Yoga :https://youtu.be/7cqzSNgNo1M?si=smMScNU7l4HdFmeb","Podcast :https://youtu.be/TTdbnc2ayys?si=tDxhwUkh5sgyegSh")); // High score recommendations
    }

       public List<String> getRecommendations(int score) {
        if (score >= -26 && score<=0)  // low score
         return recommendations.get(-1);
        else if (score >=1 && score<=40)  //moderate score
         return recommendations.get(0);
        else if (score >=41 && score <=74) // high score
         return recommendations.get(1);
        else
         return recommendations.get(1); // For scores above 40, same recommendation as 0 to 40
    }
}

        public class ResourceRecommendation {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph graph = new Graph();

        System.out.println("Welcome to Mental Health Resource Recommendation System");
        System.out.println("Please enter your mental health score:");
        int score = scanner.nextInt();

        List<String> recommendedLinks = graph.getRecommendations(score);
        System.out.println("Recommended YouTube Links:");
        for (String link : recommendedLinks) {
            System.out.println(link);
        }

        // Displaying some random links
        System.out.println("\nYou can also go through this for more information:");
        List<String> randomLinks = Arrays.asList("https://youtu.be/Sxddnugwu-8?si=tzlmCQ5OvjmajHw9", "https://youtube.com/shorts/YkwuR07hP5w?si=HXJ8NJNF8KPmVdKn", "https://youtu.be/YWDRFZFCrGE?si=ZkHtOehgOkD6RYgt");
        Collections.shuffle(randomLinks);
        for (String link : randomLinks) {
            System.out.println(link);
        }

    }
}
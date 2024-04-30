import java.util.LinkedList;
import java.util.Scanner;

class MentalHealthProblem {
    String name;
    String description;

    public MentalHealthProblem(String name, String description) {
        this.name = name;
        this.description = description;
    } // Missing closing brace for the constructor

    @Override
    public String toString() {
        return description;
    }
}

public class MentalHealthLinkedList {
    public static void main(String[] args) {
        LinkedList<MentalHealthProblem> mentalHealthProblems = new LinkedList<>();

        // Adding mental health problems
        mentalHealthProblems.add(new MentalHealthProblem("Daily Anxiety", "Feeling of worry, nervousness, or unease."));
        mentalHealthProblems.add(new MentalHealthProblem("Anxiety Disorder", "Excessive fear and anxiety, along with related behavioral disorders, manifest through various features, including anticipation of future threats. Individuals may experience heightened muscle tension and vigilance, preparing themselves for potential dangers, often resulting in cautious or avoidant behaviors. Panic attacks are a prominent feature. Diagnosis typically requires symptoms persisting for six months or more, though the duration may be shorter in children. Moreover, there's a higher prevalence among girls than boys, with a ratio of 2:1. It's crucial to note that each anxiety disorder diagnosis is made only when symptoms cannot be attributed to physiological effects of substances or medications, another medical condition, or better explained by another mental disorder."));
        mentalHealthProblems.add(new MentalHealthProblem("Daily Depression", "Feeling of persistent sadness and loss of interest."));
        mentalHealthProblems.add(new MentalHealthProblem("Depressive Disorder", "Disruptive mood dysregulation disorder, major depressive disorder, persistent depressive disorder, and premenstrual dysphoric disorder are among them. Symptoms must persist for at least two weeks (and one year in children) and involve clear-cut changes in affect, cognition, and neurovegetative functions, with interepisode remissions. It's crucial for clinicians to carefully differentiate between normal sadness and grief from a major depressive episode. Early recognition and appropriate intervention are essential for effective management and improved outcomes."));
        mentalHealthProblems.add(new MentalHealthProblem("Bipolar Disorder", "Bipolar disorder encompasses a spectrum of mood disorders, with Bipolar 1 disorder criteria reflecting the contemporary understanding of the classic manic-depressive disorder or affective psychosis. Bipolar 2 disorder, on the other hand, necessitates experiencing at least one major depressive episode and at least one hypomanic episode over a lifetime, with a duration of at least 2 years. Key features include distinct periods of abnormally and persistently elevated, expansive, or irritable mood, coupled with abnormally and persistently increased activity or energy, lasting at least 1 week and present most of the day."));
        mentalHealthProblems.add(new MentalHealthProblem("Destructive Behavior", "The recurrent behavioral outbursts indicative of a failure to control aggressive impulses, whether verbal or physical in nature, are a hallmark of this condition. These outbursts occur with a frequency of at least twice weekly, on average, over a period of three months. What distinguishes these episodes is the disproportionate magnitude of aggression expressed, surpassing the level warranted by any provocation or precipitating psychosocial stressors. Moreover, these aggressive outbursts are characterized by impulsivity and/or anger-based reactions, rather than being calculated actions aimed at achieving specific goals. This pattern of recurrent, disproportionate aggression must persist for at least six years to meet the diagnostic criteria."));
        mentalHealthProblems.add(new MentalHealthProblem("Eating Disorder", "An eating disorder is defined by a persistent disruption in eating or eating-related behavior, leading to changes in food consumption or absorption that notably impair physical health or psychosocial functioning. Interestingly, symptoms often mirror those commonly associated with substance use disorders, including cravings and patterns of compulsive use. This resemblance suggests potential involvement of overlapping neural systems. However, the exact balance between shared and distinct factors contributing to the development and perpetuation of eating disorders and substance use disorders remains insufficiently understood. Further research is needed to elucidate the complex interplay between these conditions and refine treatment approaches accordingly."));

        // Displaying mental health problems
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nWhich information will you like to read?:");
            System.out.println("1.Daily Anxiety");
            System.out.println("2.Anxiety Disorder");
            System.out.println("3.Daily Depression");
            System.out.println("4.Depressive Disorder");
            System.out.println("5.Bipolar Disorder");
            System.out.println("6.Destructive Behavior");
            System.out.println("7.Eating Disorder");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(mentalHealthProblems.get(0));
                    break;
                case 2:
                    System.out.println(mentalHealthProblems.get(1));
                    break;
                case 3:
                    System.out.println(mentalHealthProblems.get(2));
                    break;
                case 4:
                    System.out.println(mentalHealthProblems.get(3));
                    break;
                case 5:
                    System.out.println(mentalHealthProblems.get(4));
                    break;
                case 6:
                    System.out.println(mentalHealthProblems.get(5));
                    break;
                case 7:
                    System.out.println(mentalHealthProblems.get(6));
                    break;
                case 8:
                    		    return;
                default:
                    System.out.println("Your mental health matters take care <3");
            }
        }
    }
}
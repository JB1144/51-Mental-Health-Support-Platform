import java.util.Scanner;

// Class to track progress in mental health assessment
public class ProgressTracking 
{

// Class represent a question with a score for yes and no answers
    static class Question {
        String answer;
        int yes;
        int no;

        public Question(String answer, int yes, int no) {
            this.answer = answer;
            this.yes = yes;
            this.no = no;
        }
    }

//Initially the score is 0, the class keeps track of the total score as the answer to each question is yes, and the corresponding score gets added
    static class AssessmentScore {
        int totalScore = 0;
    }

//class to represent a node in the binary tree
    static class TreeNode {
        Question question;
        TreeNode left;
        TreeNode right;

        public TreeNode(Question question) {
            this.question = question;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {


 // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

// Getting the user's previous assessment score
        System.out.print("Enter your previous assessment score: ");
        int previousScore = scanner.nextInt();

 // Initializing the previous assessment score
        AssessmentScore a = new AssessmentScore();
        a.totalScore = previousScore;
        scanner.nextLine(); 

//Object for Constructing the binary tree of questions
        TreeNode root = constructBinaryTree();

//Assessment object to keep track of the total score
        AssessmentScore b = new AssessmentScore();

// Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

// Evaluate the questions in the binary tree
        evaluateQuestions(root, b , sc);


// Print the total score
        System.out.println("Total Score: " + b.totalScore);


// Comparing the current score with the previous score 
         if (b.totalScore< a.totalScore) {
            System.out.println("Great!There is progress in your mental health.");
        } else {
            System.out.println("Alas!There is no progress in your mental health or it has declined.");
        }

       
    }


// Construct the binary tree of questions
    static TreeNode constructBinaryTree() {
        Question q1 = new Question("are you ready to check you progress?", 0, 0);
        Question q2 = new Question("Do you feel generally satisfied with your life?", -1, 0);
        Question q3 = new Question("Do you take time to engage in activities that bring you joy and fulfillment?", -2, 0);
        Question q4 = new Question("Have you noticed improvements in your overall well-being and mood when you get enough sleep?", -3, 0);
        Question q5 = new Question("Do you have supportive relationships that bring positivity and fulfillment into your life?", -4, 0);
        Question q6 = new Question("Have you experienced any recent changes in your relationships or social interactions?", -5, 0);
        Question q7 = new Question("Are you able to appreciate and celebrate your strengths and successes, no matter how small?", -6, 0);
        Question q8 = new Question("Do you feel confident in your ability to overcome obstacles and persevere through difficulties?", -7, 0);
        Question q9 = new Question("Do you feel isolated or disconnected from others?", 2,0);
        Question q10 = new Question("Do you find it difficult to trust or build relationships with others?", 2,0);
        Question q11 = new Question("Do you have any history of mental health issues in your family?", 2,0);
        Question q12 = new Question("Do you use substances like alcohol or drugs to cope with your feelings?", 6,0);
        Question q13 = new Question("Do you frequently feel restless or have difficulty sitting still for extended periods?", 8,0);
        Question q14 = new Question("Do certain triggers or reminders of the trauma cause you significant distress or panic?", 10,0);
        Question q15 = new Question("Have you ever made specific plans or taken steps towards ending your life, such as collecting pills or writing a suicide note?", 12,0);
        Question q16 = new Question("Do you have intense and uncontrollable impulses to harm yourself or others?", 14,0);
        Question q17 = new Question("Have you ever charged on someone aggressively?",16,0);


// Construct the left binary tree
        TreeNode root = new TreeNode(q1);
        root.left = new TreeNode(q2);
        root.left.left = new TreeNode(q3);
        root.left.left.left = new TreeNode(q4);
        root.left.left.left.left = new TreeNode(q5);
        root.left.left.left.left.left = new TreeNode(q6);
        root.left.left.left.left.left.left = new TreeNode(q7);
        root.left.left.left.left.left.left.left = new TreeNode(q8);

// Construct the right binary tree
        root.right = new TreeNode(q9);
        root.right.right = new TreeNode(q10);
        root.right.right.right = new TreeNode(q11);
        root.right.right.right.right = new TreeNode(q12);
        root.right.right.right.right.right = new TreeNode(q13);
        root.right.right.right.right.right.right = new TreeNode(q14);
        root.right.right.right.right.right.right.right = new TreeNode(q15);
        root.right.right.right.right.right.right.right.right = new TreeNode(q16);
        root.right.right.right.right.right.right.right.right.right = new TreeNode(q17);

        return root;
    }

// Evaluate the questions in the binary tree
    static void evaluateQuestions(TreeNode root, AssessmentScore b, Scanner sc) {
        if (root == null)
            return;


// Print the question text
        System.out.println(root.question.answer);

 // Read the user's answer and convert it to lowercase
        System.out.print("Your answer (yes/no): ");
        String answer = sc.nextLine().toLowerCase();


        if (answer.equals("yes")) {
            b.totalScore += root.question.yes;
        } else {
            b.totalScore += root.question.no;
        }

 // Evaluate the questions in the left and right subtrees
        evaluateQuestions(root.left, b, sc);
        evaluateQuestions(root.right, b, sc);
    }
}

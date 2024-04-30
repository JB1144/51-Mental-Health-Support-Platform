import java.util.Scanner;

public class Assessment {

//  class represent a question with a score for yes and no answers
    static class Question
   {
        String answer;
        int yes;
        int no;

        public Question(String answer, int yes, int no)
        {
            this.answer = answer;
            this.yes = yes;
            this.no = no;
        }
    }

//Initially the score is 0, the class keeps track of the total score as the answer to each question is yes, and the corresponding score gets added

    static class AssessmentScore
     {
        int totalScore = 0;
     }

// A class to represent a node in the binary tree

    static class TreeNode
    {
        Question question;
        TreeNode left;
        TreeNode right;

        public TreeNode( Question question) 
        {
            this.question = question;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args)
    {
// Object for Constructing the binary tree of questions
        TreeNode root = constructBinaryTree();  

//Assessment object to keep track of the total score
        AssessmentScore a = new AssessmentScore();

// Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

// Evaluate the questions in the binary tree
        evaluateQuestions(root, a, sc);

// Print the total score
        System.out.println("Total Score: " + a.totalScore);
        if(a.totalScore<0) {
  		System.out.println("It's very nice to see you are mentally healthy !!!");
		}
	else if(a.totalScore>0 && a.totalScore<30) {
		System.out.println("Ohh!! Looks like you need to have some therapy..");
		}
	else {
		System.out.println("Shoot!! Don't worry we will help you.. Let's see the therapist soon.");
		}

    }


// Construct the binary tree of questions
    static TreeNode constructBinaryTree() 
      {
        Question q1 = new Question("Are you feeling good?", 0, 0);
        Question q2 = new Question("Are your eating habits healthy mostly?", -1, 0);
        Question q3 = new Question("Are you able to have a proper sleep daily?", -2, 0);
        Question q4 = new Question("Do you like being around people, you might or you might not know?", -3, 0);
        Question q5 = new Question("Are you often excited to try new stuff?", -4, 0);
        Question q6 = new Question("Do you believe in having healthy conversations after a fight?", -5, 0);
        Question q7 = new Question("Do you like to be patient while dealing with a problem?", -6, 0);
        Question q8 = new Question("Will you prefer to put your opinion in public if you see something wrong happening?", -7, 0);
        Question q9 = new Question("Do you feel lack of concentration while listening to something?", 2,0);
        Question q10 = new Question("Do you restrict yourself from eating food all the time or do you keep on bingeing often?", 4,0);
        Question q11 = new Question("Do you feel like vomiting after a workout?", 6,0);
        Question q12 = new Question("Do you frequently find yourself experiencing self-doubt?", 8,0);
        Question q13 = new Question("Do you feel that you are not safe at a certain place and is this thought often?", 10,0);
        Question q14 = new Question("Have you ever experienced thoughts of suicide or felt that your life lacked meaning?", 12,0);
        Question q15 = new Question("Do you throw stuff away or try to hurt yourself when you are angry?", 14,0);
        Question q16 = new Question("Have you ever charged on someone aggressively?",16,0);


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

        return root;
    }

// Evaluate the questions in the binary tree
    static void evaluateQuestions(TreeNode root, AssessmentScore a, Scanner sc) {
        if (root == null)
            return;

// Print the question text
        System.out.println(root.question.answer);

 // Read the user's answer and convert it to lowercase
        System.out.print("Your answer (yes/no): ");
        String answer = sc.nextLine().toLowerCase();


        if (answer.equals("yes")) {
            a.totalScore += root.question.yes;
        } else {
            a.totalScore += root.question.no;
        }

 // Evaluate the questions in the left and right subtrees
        evaluateQuestions(root.left, a, sc);
        evaluateQuestions(root.right, a, sc);
 
    }
}

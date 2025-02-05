import java.util.Scanner;

class candidateDetails {
    int rollNo;
    String name, remarks;
    float score;

    void enterData(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Roll No.: ");
        rollNo = S.nextInt();

        System.out.print("Enter Name: ");
        name = S.next();

        System.out.print("Enter Score: ");
        score = S.nextFloat();

        System.out.println("");

        assignRem();
    }

    void assignRem(){
        if(score >= 50) {
            remarks = "Selected";       
        }
        else {
            remarks = "Not Selected";
        }
    }

    void displayData()  {
        System.out.println("<<< CANDIDATE DETAILS >>>");
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Remarks: " + remarks);
    }
}

class Candidate {
    public static void main(String args[]) {

        candidateDetails obj = new candidateDetails();
        obj.enterData();
        obj.assignRem();
        obj.displayData();
    }
}

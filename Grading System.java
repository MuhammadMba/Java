import java.util.*;

class Main {
    public static void main(String[] args) {
        int sum=0;
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int noOfSubjects=sc.nextInt();
        int marks[]=new int[noOfSubjects]; //initializing array
        System.out.println("Enter your marks of "+noOfSubjects+" Subjects. Press Enter to give marks for another subject. ");
        //Entering  marks
        for(int i=0;i<noOfSubjects;i++){
            marks[i]=sc.nextInt();
        }//calculating sum
        for(int j=0;j<noOfSubjects;j++){
            sum=sum+marks[j];
        }//generating result
        int percentage=(sum/noOfSubjects);
        //can also be written as
        //int percentage
        System.out.println(percentage);
        if(percentage>= 95){
            result="You have scored A+ Grade";

        }else if(percentage>90 && percentage<95){
            result="You have scored A Grade";

        }
        else {
            result="You have passed!";
        }
        System.out.println(result);

    }


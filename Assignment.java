import java.util.Scanner;

public class Assignment{

    private static final Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {

        final String COLORRED = "\033[31;1m";
        final String COLORBLUE = "\033[34;1m";
        final String RESET = "\033[0m";

        String correctName;
        int correctAge;

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        if ((name.length() == 0) || (name.trim().isEmpty())){

            System.err.printf("%sInvalid Name \n",COLORRED);

        } else {
            correctName = name.strip();
            System.out.print("Enter Your Age: ");
            int age = scanner.nextInt();

            if ((age >= 10) && (age <= 18)) {
                scanner.nextLine();
                correctAge = age;
                System.out.print("Enter Your Subject1: ");
                String subject1 = scanner.nextLine();
                
                if (subject1.startsWith("SE-")){
                    System.out.printf("Enter Your Marks for %s: ",subject1);
                    Double marks1 = scanner.nextDouble();

                    if ((marks1 >= 0) && (marks1 <= 100)) {
                        scanner.nextLine();
                        System.out.print("Enter Your Subject2: ");
                        String subject2 = scanner.nextLine();
                        
                        if (subject2.startsWith("SE-")) { 
                            if (subject1.compareTo(subject2) != 0 ){
                                System.out.printf("Enter Your Marks for %s: ",subject2);
                                Double marks2 = scanner.nextDouble();

                                if ((marks2 >= 0) && (marks2 <= 100)) {
                                    scanner.nextLine();
                                    System.out.print("Enter Your Subject3: ");
                                    String subject3 = scanner.nextLine();

                                    if (subject3.startsWith("SE-")){
                                        if ((subject1.compareTo(subject2) != 0) && (subject1.compareTo(subject3) != 0) && (subject2.compareTo(subject3) != 0)){

                                            System.out.printf("Enter Your Marks for %s: ",subject3);
                                            Double marks3 = scanner.nextDouble(); 
                                            System.out.println();

                                            Double total = (marks1 + marks2 + marks3);
                                            Double average = total/3;
                                            
                                            String status;

                                            if (average >= 75){
                                                status = "\033[34;1mDistinguished Pass\033[0m";
                                            } else if ((average >= 65) && (average < 75)){
                                                status = "\033[32;1mCredit Pass\033[0m";
                                            } else if ((average >= 55) && (average < 65)){
                                                status = "\033[33;1mPass\033[0m";
                                            } else {
                                                status = "\033[31;1mFail\033[0m";
                                            }

                                            String markStatus1;

                                            if (marks1  >= 75 ){ 
                                                markStatus1 = "\033[34;1mDistinguished Pass\033[0m";
                                            } else if ((marks1 >= 65) && (marks1 < 75)) {
                                                markStatus1 = "\033[32;1mCredit Pass\033[0m";
                                            } else if ((marks1 >= 55) && (marks1 < 65)){
                                                markStatus1 = "\033[33;1mPass\033[0m";
                                            } else {
                                                markStatus1 = "\033[31;1mFail\033[0m";
                                            }

                                            String markStatus2;

                                            if (marks2  >= 75) {
                                                markStatus2 = "\033[34;1mDistinguished Pass\033[0m";
                                            } else if ((marks2 >= 65) && (marks2 < 75)){
                                                markStatus2 = "\033[32;1mCredit Pass\033[0m";
                                            } else if ((marks2 >= 55) && (marks2 < 65)){
                                                markStatus2 = "\033[33;1mPass\033[0m";
                                            } else {
                                                markStatus2 = "\033[31;1mFail\033[0m";
                                            }

                                            String markStatus3;

                                            if (marks3  >= 75) {
                                                markStatus3 = "\033[34;1mDistinguished Pass\033[0m";
                                            } else if ((marks3 >= 65) && (marks3 < 75)){
                                                markStatus3 = "\033[32;1mCredit Pass\033[0m";
                                            } else if ((marks3 >= 55) && (marks3 < 65)){
                                                markStatus3 = "\033[33;1mPass\033[0m";
                                            } else {
                                                markStatus3 = "\033[31;1mFail\033[0m";
                                            }

                                            System.out.printf("Name     : %s%s%s \n",COLORBLUE,correctName.toUpperCase(),RESET);
                                            System.out.printf("Age      : %s Years Old \n",correctAge);
                                            System.out.printf("Status   : %s \n", status);
                                            System.out.printf("Total    : %.2f \n", total);
                                            System.out.printf("Avg      : %.2f%% \n", average);

                                            System.out.println();

                                            System.out.println("+----------+-------+--------------------+");
                                            System.out.printf("| SUBJECT  | MARKS |             STATUS | \n");
                                            System.out.println("+----------+-------+--------------------+");
                                            System.out.printf("| %s00%s   | %5.2f | %29s | \n",subject1.substring(0,3),subject1.substring(3),marks1,markStatus1);
                                            System.out.println("+----------+-------+--------------------+");
                                            System.out.printf("| %s00%s   | %5.2f | %29s | \n",subject2.substring(0,3),subject2.substring(3),marks2,markStatus2);
                                            System.out.println("+----------+-------+--------------------+");
                                            System.out.printf("| %s00%s   | %5.2f | %29s | \n",subject3.substring(0,3),subject3.substring(3),marks3,markStatus3);
                                            System.out.println("+----------+-------+--------------------+");

                                            System.out.println();

                                        } else {System.out.printf("%sSubject is already Exist \n",COLORRED);} 

                                    } else {System.err.printf("%sInvalid Subject \n",COLORRED);}

                                } else {System.err.printf("%sInvalid Marks \n",COLORRED);}

                            } else {System.out.printf("%sSubject is already Exist \n",COLORRED);}

                        } else {System.err.printf("%sInvalid Subject \n",COLORRED);} 
                    
                    }else {System.err.printf("%sInvalid Marks \n",COLORRED);}

                } else {System.err.printf("%sInvalid Subject \n",COLORRED);}

            } else {System.err.printf("%sInvalid Age \n",COLORRED);}

        } 

    }

}

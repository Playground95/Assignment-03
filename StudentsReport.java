import java.util.Scanner;

public class StudentsReport {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String color = "\033[";
        String name;
        int age=0;
        String sub1;
        double marks1;
        String sub2;
        double marks2;
        String sub3;
        double marks3;
        

        label01:{

            System.out.println("Enter Your Name: ");
            name = scanner.nextLine().strip();
            if(name.length()==0) {
                System.out.println("\033[31mInvalid Name!\033[0m");
                break label01;
            }
            

            System.out.println("Enter Your Age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            if(age >= 10 & age <=18) {
                System.out.println("\033[31mInvalid Age!\033[0m");
                break label01;
            }
                
                
            System.out.println("Enter Your Subject 01: ");
            sub1 = scanner.nextLine().strip();
            if(!sub1.startsWith("SE-")) {
                System.out.println("\033[31mInvalid Subject!\033[0m");
                break label01;
            }    

            System.out.println("Enter Your Marks 01: ");
            marks1 = scanner.nextDouble();
            scanner.nextLine();
            if(marks1 <0 | marks1 >100) {
                System.out.println("\033[31mInvalid Marks!\033[0m");
                break label01;
            }        

            System.out.println("Enter Your Subject 02: ");
            sub2 = scanner.nextLine().strip();

            if(sub2.equals(sub1)) {
                System.out.println("\033[31mSubject Name has Already Entered!\033[0m"); 
                break label01;
            }
            
            if(!sub2.startsWith("SE-")) {
                    System.out.println("\033[31mInvalid Subject!\033[0m");
                    break label01;
            }


            System.out.println("Enter Your Marks 02: ");
            marks2 = scanner.nextDouble();
            scanner.nextLine();
            if(marks2 <0 | marks2 >100) {
                System.out.println("\033[31mInvalid Marks!\033[0m");
                break label01;
            }                    

            System.out.println("Enter Your Subject 03: ");
            sub3 = scanner.nextLine().strip();
            if(sub3.equals(sub2) | sub3.equals(sub1)) {
                System.out.println("\033[31mSubject Name has Already Entered!\033[0m");
                break label01;
            }

            if(!sub3.startsWith("SE-")) {
                System.out.println("\033[31mInvalid Subject!\033[0m");
                break label01;
            }

            System.out.println("Enter Your Marks 03: ");
            marks3 = scanner.nextDouble();
            scanner.nextLine();
            if(marks3 <0 | marks3 >100) {
                System.out.println("\033[31mInvalid Marks!\033[0m");
                break label01;
            }

            double totalMarks = marks1 + marks2 + marks3;
            double avgMarks = totalMarks/3;
            String overallStatus;
            String statusSub1;
            String statusSub2;
            String statusSub3;

            if(avgMarks >= 75) overallStatus = "Distinguished Pass";
            else if(avgMarks >= 65) overallStatus = "Credit Pass";
            else if(avgMarks >= 55) overallStatus = "Pass";
            else overallStatus = "Fail";

            if(marks1 >= 75) statusSub1 = "\033[32;1mDistinguished Pass\033[0m";
            else if(marks1 >= 65) statusSub1 = "\033[34;1mCredit Pass\033[0m";
            else if(marks1 >= 55) statusSub1 = "\033[33;1mPass\033[0m";
            else statusSub1 = "\033[31;1mFail\033[0m";

            if(marks2 >= 75) statusSub2 = "\033[32;1mDistinguished Pass\033[0m";
            else if(marks2 >= 65) statusSub2 = "\033[34;1mCredit Pass\033[0m";
            else if(marks2 >= 55) statusSub2 = "\033[33;1mPass\033[0m";
            else statusSub2 = "\033[31;1mFail\033[0m";

            if(marks3 >= 75) statusSub3 = "\033[32;1mDistinguished Pass\033[0m";
            else if(marks3 >= 65) statusSub3 = "\033[34;1mCredit Pass\033[0m";
            else if(marks3 >= 55) statusSub3 = "\033[33;1mPass\033[0m";
            else statusSub3 = "\033[31;1mFail\033[0m";
                    
                                                    
            System.out.println("+" + "-".repeat(15) + "+" + "-".repeat(15) + "+" + "-".repeat(15) + "+");
            System.out.printf("|%-15s%3$s34;1m%-32s%3$s0m|\n","Name: ", name.toUpperCase(), color);
            System.out.printf("|%-15s%-53s|\n","Age: ", "\033[31;1m"+age+"\033[0m" +" \033[34;myears old\033[0m"); 
            System.out.printf("|%-15s%3$s31;1m%-32s%3$s0m|\n", "Status:", overallStatus, color); 
            System.out.printf("|%-23s%-24s|\n", "Total: " + totalMarks, "Avg: " + avgMarks +"%");
            System.out.println("+" + "-".repeat(15) + "+" + "-".repeat(15) + "+" + "-".repeat(15) + "+");
            System.out.printf("|%4$s0;1m%-15s%4$s0m|%4$s0;1m%-15s%4$s0m|%4$s0;1m%-15s%4$s0m|\n", "Subject", "Marks", "Status", color);
            System.out.println("+" + "-".repeat(15) + "+" + "-".repeat(15) + "+" + "-".repeat(15) + "+");
            System.out.printf("|%6$s31m%-3s%03d%s%6$s0m|%6$s31m%-15f%6$s0m|%-26s|\n", "SE-", Integer.parseInt(sub1.substring(3))," ".repeat(9), marks1, statusSub1, color);
            System.out.printf("|%6$s31m%-3s%03d%s%6$s0m|%6$s31m%-15f%6$s0m|%-26s|\n", "SE-", Integer.parseInt(sub2.substring(3))," ".repeat(9), marks2, statusSub2, color);
            System.out.printf("|%6$s31m%-3s%03d%s%6$s0m|%6$s31m%-15f%6$s0m|%-26s|\n", "SE-", Integer.parseInt(sub3.substring(3))," ".repeat(9), marks3, statusSub3, color);
            System.out.println("+" + "-".repeat(15) + "+" + "-".repeat(15) + "+" + "-".repeat(15) + "+");



                       
                
        }
        
    
    }
}
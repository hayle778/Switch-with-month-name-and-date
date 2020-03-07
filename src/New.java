//Write a program to find the number of days in a month
// import java.time.Month;
import java.time.MonthDay;
import java.util.Scanner;
    public class New {
    public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
       int month, year;
       String MonthOfName;
        //DIM is suppose to be for days in a month:

       System.out.println("input a month number: ");
     month = input.nextInt();
     System.out.println(" Input a year: ");
     year =  input.nextInt();
 //System.out.println("Months"+ p + numofMonths( MonthDay ));
         int DIM;

     switch(month) {
         //public static String numofMonths(String Months){
         case 1:
             MonthOfName = "September";
             DIM = 31;
            break;
         case 2:
             MonthOfName = "October:";
             DIM = 28;
             break;
         case 3:
             MonthOfName = "November";
             DIM = 31;
         case 4:
             MonthOfName = "December";
             DIM = 30;
         case 5:
             MonthOfName = "January ";
             DIM = 30;
         case 6:
             MonthOfName = "Febuary ";
             DIM = 28;
             case7:
             MonthOfName = "March";
             DIM = 30;
         case 8:
             MonthOfName = "April ";
             DIM = 31;
         case 9:
             MonthOfName = "May";
             DIM = 30;
         case 10:
             MonthOfName = "June ";
             DIM = 31;
         case 11:
             MonthOfName = "July ";
             DIM = 29;
         case 12:
             MonthOfName = "August";
             DIM = 32;

       System.out.println(MonthOfName + "" + year + " has " + DIM);
     }
    }
}

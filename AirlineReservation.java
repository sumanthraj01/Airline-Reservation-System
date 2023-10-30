import java.util.Scanner;
public class AirlineReservation 
{
    private static boolean[] seats = new boolean[10];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Reserve a seat");
            System.out.println("2.View all seats");
            System.out.println("3.Exit");
            int choice = sc.nextInt();
            if(choice==1)
            {
                reserveSeat();
            }
            else if(choice==2)
            {
                viewSeats();
            }
            else if(choice==3)
            {
                break;
            }
            else
            {
                System.out.println("Invalid choice, Please try again.");
            }
        }
        sc.close();
    }
    private static void reserveSeat()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter seat number: ");
        int seatNum = sca.nextInt();
        if(seats[seatNum-1]==false)
        {
            seats[seatNum-1]=true;
            System.out.println("Seat reserved. Thank You!");
        }
        else
        {
            System.out.println("Sorry, this seat is already reserved.");
        }
        sca.close();
    }
    private static void viewSeats()
    {
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]==true)
            {
                System.out.println("Reserved.");
            }
            else
            {
                System.out.println("seat "+(i+1)+" Available.");
            }
        }
    }
}
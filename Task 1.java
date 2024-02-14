import java.util.*;
class numberGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=(int)(Math.random()*100);
        int t=0;
        System.out.println("Guess the number");
        while(true)
        {
            t=sc.nextInt();
            if(t>n)
            {
                System.out.println("Too High, Guess again!");
                continue;
            }
            else if(t<n)
            {
                System.out.println("Too Low, Guess again!");
                continue;
            }
            else
            {
                System.out.println("Correct");
                break;
            }
        }
    }
}

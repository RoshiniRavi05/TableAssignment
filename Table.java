import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n;
        while (true) {
            System.out.print("Enter array size (for PxP array): ");
            if(sc.hasNextInt()) {
                n=sc.nextInt();
                if(n>0) {
                    break;
                }
            }else{
                sc.next(); 
            }
            System.out.println("Invalid input. Try again.");
        }
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=(r.nextInt(8)+1)*2;
            }
        }
        System.out.println("\nGenerated 2D array:");
        System.out.print("    ");
        for(int i=0;i<n;i++) {
            System.out.printf("%4s", String.format("%02d", i));
        }
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print("   +");
            for(int j=0;j<n;j++) {
                System.out.print("----+");
            }
            System.out.println();
            System.out.printf("%02d |", i);
            for(int j=0;j<n;j++) {
                System.out.printf("%3d |", arr[i][j]);
            }
            System.out.println();
        }
        System.out.print("   +");
        for(int j=0;j<n;j++) {
            System.out.print("----+");
        }
        System.out.println();
        int x;
        while (true) {
            System.out.print("\nEnter a number to highlight (even number 2-16): ");
            if(sc.hasNextInt()) {
                x=sc.nextInt();
                if(x>=2&&x<=16&&x%2==0) {
                    break;
                }
            } else{
                sc.next();
            }
            System.out.println("Invalid input. Try again.");
        }
        int count=0;
        System.out.println("\nArray with " + x + " highlighted:");
        System.out.print("    ");
        for(int i=0;i<n;i++) {
            System.out.printf("%4s", String.format("%02d", i));
        }
        System.out.println();

        for(int i=0;i<n;i++) {
            System.out.print("   +");
            for(int j=0;j<n;j++) {
                System.out.print("----+");
            }
            System.out.println();
            System.out.printf("%02d |", i);
            for(int j=0;j<n;j++) {
                if(arr[i][j]==x) {
                    System.out.printf("[%2d]|", arr[i][j]);
                    count++;
                }else{
                    System.out.printf("%3d |", arr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.print("   +");
        for(int j=0;j<n;j++) {
            System.out.print("----+");
        }
        System.out.println();
        System.out.println("\nNumber " + x + " appeared " + count + " time(s)");
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        String job;
        int age;
        try {
            System.out.println("inter Name: ");
             name = input.nextLine();
            System.out.println("inter job: ");
             job = input.nextLine();
            System.out.println("inter age: ");
             age = input.nextInt();

            System.out.println("\n----------- User Info ------------");
            System.out.println("Name: "+ name);
            System.out.println("Job: "+job);
            System.out.println("Age: "+ age);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            input.close();
        }
    }
}
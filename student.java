import java.util.*;

class student
{
    String usn;
    String name;
    
    int credits[] = new int[30];
    int marks[] = new int[30];
    int i,n ;
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subjects to enter the marks");
        n = sc.nextInt();
        System.out.println("Enter the USN : ");
        usn = sc.next();
        System.out.println("Enter the Name of the student : ");
        name = sc.next();
        
        for(i=1 ; i<=n ; i++)
        {
            
            System.out.println("Enter the marks of the subject " +i + " : ");
            marks[i] = sc.nextInt();
            System.out.println("Enter the credits of the subject " +i + " : ");
            credits[i] = sc.nextInt();
        }
    }
    public void display()
    {
        System.out.println("******* RESULT *******");
        System.out.println("Name of the student is : " +name);
        System.out.println("USN : " +usn);
        for(i=1 ; i<=n ; i++)
        {
            System.out.println("Credits of subject " +i  + " : " +credits[i]);
            System.out.println("Marks of the subject " +i + " : " +marks[i]);
        }
        calculate();
    }
    
    public void calculate()
    {
        int tcredits = 0;
        int sgpa =0;
        int grade = 0;
        for(i=1 ; i<=n ; i++)
        {
            tcredits = tcredits + credits[i];
        }
        for(i=1 ; i<=n ; i++)
        {
            if(marks[i]>90)
            grade = 10;
            else if(marks[i]<=90 && marks[i]>75)
            grade = 9;
            else if(marks[i]<=75 && marks[i]>65)
            grade = 8;
            else if(marks[i]<=65 && marks[i]>55)
            grade = 7;
            else if(marks[i]<=55 && marks[i]>45)
            grade = 6;
            else if(marks[i]<=45 && marks[i]>38)
            grade = 5;
            else if(marks[i]<38)
            grade = 0;
            
            sgpa = sgpa + grade * credits[i];
        }
        sgpa = sgpa / tcredits;
        System.out.println("SGPA of the student is : " +sgpa);
    }
    public static void main(String args[])
    {
        student s = new student();
        s.accept();
        s.display();
    }
}
        
            
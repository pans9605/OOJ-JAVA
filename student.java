import java.util.Scanner;
class Stud_details{
     String usn;
     String name;
     int marks[]=new int[5];
     int credits[]=new int[5];
     double sgpa;
     double sum=0.0;
     
     
     Scanner sc=new Scanner(System.in);
     
     void get_details(){
          System.out.println("enter usn");
          usn=sc.nextLine();
          System.out.println("enter name");
          name=sc.nextLine();

          for(int i=0;i<5;i++){
              System.out.println("enter subject "+(i+1)+" marks");
              marks[i]=sc.nextInt();
            }
    }

          
     


     void display(){
          System.out.println("Name: "+name);
          System.out.println("USN: "+usn);
          for(int i=0;i<5;i++){
              System.out.println("marks of subject "+(i+1)+"="+marks[i]);
        }
       
     
     void sgpa(){
         for(i=0;i<5;i++){
               if(marks[i]>=90 && marks[i]<=100){
                    credits[i]=10;
               }
               else if(marks[i]>=80 && marks[i]<90){
                    credits[i]=9;
               }
               else if(marks[i]>=70 && marks[i]<80){
                    credits[i]=8;
               }
               else if(marks[i]>=60 && marks[i]<70){
                    credits[i]=7;
               }
               else if(marks[i]>=55 && marks[i]<=59){
                    credits[i]=6;
               }
               else if(marks[i]>=50 && marks[i]<=54){
                    credits[i]=5;
               }
               else if(marks[i]>=40 && marks[i]<=49){
                    credits[i]=4;
               }
               else if(marks[i]>=0 && marks[i]<=39){
                    credits[i]=0;
               }
          }
          for(i=0;i<5;i++){
               sum=sum+(credits[i]*4);
             }
          sgpa=sum/20;
          System.out.println("SGPA: "+SGPA);
       }
    }

class student{
     public static void main(String args[]){
          Stud_details s1[]=new Stud_details[3];
          for(int j=0;j<3;j++)
              {
                 s1[j]=new Stud_details();
               }
           for(int j=0;j<3;j++)
                  {
                    s1[j].get_details();
                 }
           for(int j=0;j<3;j++)
                  {
                    s1[j].display();
                    s1[j].sgpa();
                 }

                }
  } 
 
     
     
          
         
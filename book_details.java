import java.util.Scanner;
class book{
       Scanner sc=new Scanner(System.in);
       String name,author;
       int price,num_pages;
       
       book(){
             name=" ";
             author=" ";
             price=-1;;
             num_pages=-1;
         }

       void get_details(){
             System.out.println("enter book name");
             name=sc.nextLine();
             System.out.println("enter author name");
             author=sc.nextLine();
             System.out.println("enter book price ");
             price=sc.nextInt();
             System.out.println("enter number of pages");
             num_pages=sc.nextInt();
         }

      void set_details(){
            System.out.println("Book Name: "+name);
            System.out.println("Author Name: "+author);
            System.out.println("Book Price: "+price);
            System.out.println("No.of pages: "+num_pages);
        }
}


class book_details{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter number of books");
          int p=sc.nextInt();
          book b1[]=new book[p];

          for(int i=0;i<p;i++)
              {
                 b1[i]=new book();
                 System.out.println(b1[i].toString());
               }
          for(int i=0;i<p;i++){
               System.out.println("enter book "+(i+1)+" details:");
               b1[i].get_details();
            }
          for(int i=0;i<p;i++){
               System.out.println("book "+(i+1)+" details:");
               b1[i].set_details();
            }
     }
}
          
          
            
             
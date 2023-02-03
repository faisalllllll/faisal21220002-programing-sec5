package asp;

import java.util.Scanner;
public class Asp {
     int maxtime=18000 , mintime=1;
     
     private String text;
     public String gettext() {
      return text;
   }

   public void settext( String newtext) {
      text = newtext;
   }
    public static void main(String[] args) {
        
       
        // رسالة إفتتاحية للبرنامج
        System.out.println("\t\t\tASP system\n\n");
        
        Scanner input = new Scanner(System.in);
        // خيارات للتنفيذ
        System.out.println("1- Add teams." + "\n2- Exit");
        
        // أخذ قيمة من المستخدم تدل علي الخيار المطلوب
        System.out.print("\nChoose an option: ");
        int option = input.nextInt();

        
        switch (option) {
            // في هذا الاختيار يستطيع المستخدم إضافة تيم
            case 1:
                addteems addteam = new addteems();
                addteam.setteems();
                
                break;
                
                // في هذا الاختيار الخروج من البرنامج
            case 2:
                System.exit(0);
                break;
                
               // عند اختيار خيار ليس موجود تظهر هذه الرساله
            default:
                System.out.println("Wrong option, program will stop and run it again...");
        }

    }

}


package asp;

import java.util.Scanner;
import java.util.Arrays;

public class scoreboard extends editscoreboard{

    Scanner input = new Scanner(System.in);
    int num_of_teems;

    // أخذ عدد التيمات
    public scoreboard(int num_of_teems) {
        this.num_of_teems = num_of_teems;
    }

    public scoreboard() {

    }

    public void getscoreboard(String[] name, int[] id, int[] score, int[] time) {
        int rank = 1;
        int counter=0;
        int[] usedids = new int[num_of_teems];
        // New Array
        int[] sortscore = new int[num_of_teems];

        for (int i = 0; i < num_of_teems; i++) {
            sortscore[i] = score[i];
        }

        // ترتيب عدد الاسئلة المجابة من الاصغر للاكبر
        Arrays.sort(sortscore);

        System.out.println("###############################################################################");
        System.out.println("#\tRank\t#\tID\t#\tname\t#\tSolved\t#\tTime\t#");
        // ترتيب بيانات التيمات من الاكبر في الاسئلة المجابة إلي الأصغر
        for (int i = num_of_teems - 1; i >= 0; i--) {
            for (int j = 0; j < num_of_teems; j++) {
                for(int k=0 ; k<num_of_teems ; k++){
                if (sortscore[i] == score[j] && usedids[j]!=id[j]) {
                    System.out.println("#\t" + rank + "\t#\t" + id[j] + "\t#\t" + name[j] + "\t#\t" + sortscore[i] + "/10\t#\t" + time[j] + "\t#\t");
                    rank++;
                    usedids[j]=id[j];
                    
                }
                
                
            }
            }
        }

        int option;
        // خيارات
        System.out.println("1- Update score" + "\n2- Exit");

        System.out.print("Choose an option: ");
        option = input.nextInt();

        switch (option) {
            // 1 لإدخال رقم التيم
            case 1:
                System.out.println("Enter team ID: ");
                int checkid = input.nextInt();

                editscoreboard editsc = new editscoreboard();
                int noteams = num_of_teems;
                editsc.updatescore(name, id, score, time, checkid, noteams);
                break;
            case 2:
                editscoreboard exito = new scoreboard();
                exito.exitf();
                System.exit(0);
                break;
        }

    }
    
    
    @Override
    public void exitf(){
        System.out.println("Bye Bye");
    }
    
    

}

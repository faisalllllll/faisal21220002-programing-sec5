
package asp;

import java.util.Scanner;
import java.util.Random;

public class editscoreboard {

    Scanner input = new Scanner(System.in);
    
    public editscoreboard() {

    }

    public void updatescore(String[] name, int[] id, int[] score, int[] time, int checkid, int noteams) {
        // عند الوصول لهذه الفنكشن ... يزداد الاسئلة المجابة واحد
        for (int i = 0; i < noteams; i++) {
            if (id[i] == checkid) {
                score[i]++;
                time[i]+=(int)Math.floor(Math.random() * (60 - 2 + 1) + 2);
            }
        }
        // إرسال البيانات مرة أحري لعرضها بعد التعديل
        scoreboard sc = new scoreboard(noteams);
        sc.getscoreboard(name, id, score, time);

    }
    
    
    public void exitf(){
        System.out.print("Bye Bye");
    }
}

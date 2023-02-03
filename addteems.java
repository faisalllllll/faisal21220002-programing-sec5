
package asp;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class addteems extends Asp {

    Scanner input = new Scanner(System.in);

    public addteems() {

    }

    public void setteems() {
        int team=1;
        
        // إدخال عدد التيمات
        System.out.print("Enter number of teams: ");
        int number_of_teems = input.nextInt();
        
        
        String[] name = new String[number_of_teems];
        int[] score = new int[number_of_teems];
        int[] id = new int[number_of_teems];
        int[] time = new int[number_of_teems];

        // إدخال بيانات كل تيم
        for (int i = 0; i < number_of_teems; i++) {
            System.out.println();
            System.out.print("Enter Name of team " + team + ": ");
            name[i] = input.next();

            System.out.print("\nEnter id of team " + team + ": ");
            id[i] = input.nextInt();

            System.out.print("\nEnter score of team " + team + ": ");
            score[i] = input.nextInt();

            addteems gettime = new addteems();
            time[i] =  (int)Math.floor(Math.random() * (gettime.maxtime - gettime.mintime + 1) + gettime.mintime);
            Asp text = new Asp();
            text.settext("\nSuccessfully team ");
                        System.out.println(text.gettext()+ team + " added");

            team++;
        }
        // إرسال بيانات التيمات لعرضها
        scoreboard sc = new scoreboard(number_of_teems);
        sc.getscoreboard(name, id, score, time);
    }
}

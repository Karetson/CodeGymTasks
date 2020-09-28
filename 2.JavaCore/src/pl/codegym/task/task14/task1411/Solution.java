package pl.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, loser, coder i programmer
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Pętla do wczytywania kluczy. Punkt 1
        while (true) {
            String key = reader.readLine();
        if (key.equals("user")) {
            Person.User user = new Person.User();
            doWork(user);
        } else if (key.equals("loser")) {
            Person.Loser loser = new Person.Loser();
            doWork(loser);
        } else if (key.equals("coder")) {
            Person.Coder coder = new Person.Coder();
            doWork(coder);
        } else if (key.equals("programmer")) {
            Person.Programmer programmer = new Person.Programmer();
            doWork(programmer);
        } else
            break;
        }
    }

    public static void doWork(Person person) {
        // Punkt 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}

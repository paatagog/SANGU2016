package ge.sangu.nikoloz.homework;

import java.util.Comparator;

/**
 * Created by Nikoloz on 11/7/2016.
 */
public class Davaleba6_Student implements Comparator {
    private String name;
    private String surName;
    private int score;

    public int countName(){
        return this.name.length();
    }
    public int countSurname()
    {
        return this.surName.length();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

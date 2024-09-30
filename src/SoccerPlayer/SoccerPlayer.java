//4- Create SoccerPlayer class
//
//Task:
//a. Create SoccerPlayers class which will have name, age, team, scoredGoals.
//b. Create 3 Constructor (name, age, team, scoredGoals) (name, age, scoredGoals) (name, age, team)
//c. Create getter and setter for all variables.
//d. Override toString function
//e. Override equals function to compare scoredGoals and team (just two of them)
//f. Create main function and in the main function create 5-6 players. Then Test all of them.
//g. Create github repo for this project from your github and publish your codes in your github, then send the link to me.
//
//
//!!! IMPORTANT !!!
//If you have any question please ask me and try to complete the exercise.
package SoccerPlayer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.PrimitiveIterator;

public class SoccerPlayer {
    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    //constructors
    public SoccerPlayer(String name, int age, String Team, int scroedGoals) {
        this.name = name;
        this.age = age;
        this.team = Team;
        this.scoredGoals = scroedGoals;

    }

    public SoccerPlayer(String name, int age, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.scoredGoals = scoredGoals;

        System.out.println(hashCode());
    }

    public SoccerPlayer(String name, int age, String Team) {
        this.name = name;
        this.age = age;
        this.team = Team;

        System.out.println(hashCode());

    }
    //Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public String getTeam() {
        return team;
    }

    //Setters

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    //d. Override toString function

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", scoredGoals=" + scoredGoals +
                '}';
    }
    //e. Override equals function to compare scoredGoals and team (just two of them)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) o;
        return scoredGoals == that.scoredGoals && Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, scoredGoals);
    }
}

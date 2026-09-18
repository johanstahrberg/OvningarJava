package com.example.java26.oop;

public class Uppgift2_7 {
    static void main() {

        Employee employee = new Employee("Martin", 40000, "Education");

        Team team1 = new Team("Team 1", employee);
        Team team2 = new Team("Team 2", null);

        team1.copyTo(team2);

        team2.getTeamLeader().setSalary(50000);

        IO.println(team1.getTeamLeader().getSalary());
        IO.println(team2.getTeamLeader().getSalary());


    }
}

package com.example.java26.oop;

public class Team {

    private String teamName;
    private Employee teamLeader;

    public Team(String teamName, Employee teamLeader) {
        this.teamName = teamName;
        this.teamLeader = teamLeader;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Employee getTeamLeader() {
        return teamLeader;
    }

    public void copyTo(Team clone) {
        clone.teamName = teamName;
        clone.teamLeader = teamLeader;
        clone.teamLeader = new Employee(teamLeader);
    }


}

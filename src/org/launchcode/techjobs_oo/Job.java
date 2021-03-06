package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

//custom toString method

    @Override
    public String toString() {
        String jobString = "\n" +
                "ID:" + this.id + "\n";
//        if(){
//            //if(this.name == null && this.employer.getValue() == null && this.location.getValue() == null && this.positionType.getValue() == null && this.coreCompetency.getValue() == null){
//            return "OOPS! This job does not seem to exist.";
//        }
        if(this.name != null  && this.name.length() > 0){
            jobString += "Name: " + this.name + "\n";
        }else{
            jobString += "Name: **Data not available\n";
        }
        if(this.employer.getValue() != null && this.employer.getValue().length() > 0){
            jobString += "Employer: " + this.employer + "\n";
        }else{
            jobString += "Employer: **Data not available\n";
        }
        if(this.location.getValue() != null && this.location.getValue().length() > 0){
            jobString += "Location: " + this.location + "\n";
        }else{
            jobString += "Location: **Data not available\n";
        }
        if(this.positionType.getValue() != null && this.positionType.getValue().length() > 0){
            jobString += "Position Type: " + this.positionType + "\n";
        }else{
            jobString += "Position Type: **Data not available\n";
        }
        if(this.coreCompetency.getValue() != null && this.coreCompetency.getValue().length() > 0){
            jobString += "Core Competency: " + this.coreCompetency + "\n";
        }else{
            jobString += "Core Competency: **Data not available\n";
        }
        jobString += "\n";
        return jobString;
    }
}

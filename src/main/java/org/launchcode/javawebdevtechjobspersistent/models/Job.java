package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends  AbstractEntity{


    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills= new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> fewSkills) {
        super();
        this.employer = anEmployer;
        this.skills = fewSkills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> aSkills){
        for(Skill skill : aSkills){
            this.skills.add(skill);
        }
    }
}

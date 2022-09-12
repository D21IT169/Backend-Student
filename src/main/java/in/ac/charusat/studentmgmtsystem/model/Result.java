package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {

    @Id
    private Integer id;
    private String name;
    private float percentage;


    public Result(Integer id, String name, float percentage){
        this.id=id;
        this.name=name;
        this.percentage=percentage;
    }

    public Result(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }












}

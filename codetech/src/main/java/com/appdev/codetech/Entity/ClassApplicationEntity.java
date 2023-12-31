package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblcreateclass")
public class ClassApplicationEntity {

    @Id
    @Column(name = "classcode")
    private String classcode;

    @Column(name = "classname")
    private String classname;
    @Column(name = "classdescription")
    private String classdescription;

    public ClassApplicationEntity() {
        super();
    }

    public ClassApplicationEntity(String classname, String classdescription, String classcode) {
        this.classname = classname;
        this.classdescription = classdescription;
        this.classcode = classcode;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassdescription() {
        return classdescription;
    }

    public void setClassdescription(String classdescription) {
        this.classdescription = classdescription;
    }

    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

}

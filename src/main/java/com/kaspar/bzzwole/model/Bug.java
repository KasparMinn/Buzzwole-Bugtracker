package com.kaspar.bzzwole.model;

import javax.persistence.*;

@Entity
@Table(name = "bugs")
public class Bug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bugId;

    @Column(name = "bug_type")
    private String bugType;

    @Column(name = "bug_subject")
    private String bugSubject;

    @Column(name = "bug_status")
    private String bugStatus;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "due_date")
    private String dueDate;

    @Column(name = "est_hours")
    private String bugEstimatedHours;

    // Empty default method for Hibernate:
    public Bug() {

    }

    // Main constructor:
    public Bug(String bugType, String bugSubject, String bugStatus, String startDate, String dueDate, String bugEstimatedHours) {

        super();
        this.bugType = bugType;
        this.bugSubject = bugSubject;
        this.bugStatus = bugStatus;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.bugEstimatedHours = bugEstimatedHours;

    }

    public long getbugId() { return bugId; }
    public void setbugId(long bugId) { this.bugId = bugId; }

    public String getBugType() { return bugType; }
    public void setBugType(String bugType) { this.bugType = bugType; }

    public String getBugSubject() { return bugSubject; }
    public void setBugSubject(String bugSubject) { this.bugSubject = bugSubject; }

    public String getBugStatus() { return bugStatus; }
    public void setBugStatus(String bugStatus) { this.bugStatus = bugStatus; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public String getBugEstimatedHours() { return bugEstimatedHours; }
    public void setBugEstimatedHours(String bugEstimatedHours) { this.bugEstimatedHours = bugEstimatedHours; }

}

package com.example.marwaadel.attendancesystem.model;

import com.example.marwaadel.attendancesystem.utils.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.firebase.client.ServerValue;

import java.util.HashMap;

/**
 * Created by Marwa Adel on 3/18/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    public Student(String studentID, String studentName, String userEmail, HashMap<String, Object> timestampCreated) {
        this.studentID = studentID;
        this.studentName = studentName;
        UserEmail = userEmail;
        this.timestampCreated = timestampCreated;
    }

    private String studentID;
    private String studentName;
    private String UserEmail;
    private HashMap<String, Object> date;
    private HashMap<String, Object> time;
    private HashMap<String, Object> timestampLastChanged;
    private HashMap<String, Object> timestampCreated;

    public Student() {
    }


    public Student(String studentID, String studentName, String enterLecture, String outerLecture, HashMap<String, Object> timestampCreated) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.timestampCreated = timestampCreated;

        HashMap<String, Object> timestampNowObject = new HashMap<String, Object>();
        timestampNowObject.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);
        this.timestampLastChanged = timestampNowObject;
    }


    public Student(String studentID, String studentName, String enterLecture, String outerLecture, HashMap<String, Object> time, HashMap<String, Object> date) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.time = time;
        this.date = date;
        HashMap<String, Object> timestampNowObject = new HashMap<String, Object>();
        timestampNowObject.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);
        this.timestampLastChanged = timestampNowObject;
    }


    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public HashMap<String, Object> getTimestampCreated() {
        return timestampCreated;
    }

    public HashMap<String, Object> getTimestampLastChanged() {
        return timestampLastChanged;
    }

    public HashMap<String, Object> getDate() {
        return date;
    }

    public HashMap<String, Object> getTime() {
        return time;
    }

    @JsonIgnore
    public long getTimestampLastChangedLong() {

        return (long) timestampLastChanged.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }

    @JsonIgnore
    public long getTimestampCreatedLong() {
        return (long) timestampLastChanged.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }


    @JsonIgnore
    public long getDateLong() {
        return (long) date.get(Constants.FIREBASE_PROPERTY_date);
    }

    @JsonIgnore
    public long getTimeLong() {
        return (long) time.get(Constants.FIREBASE_PROPERTY_TIME);
    }


}

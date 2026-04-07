package com.azatdaevsura.predict_api.model;

public class UserModel {

    // User attributes
    private String userId;
    private String userName;
    private double studyHours;
    private double attendanceRate;
    private double previousGrades;
    private int parentsEducationLevel;

    //userId counter
    public static int userIdCounter = 1;

    // Constructor
    public UserModel(String userName, double studyHours, double attendanceRate, double previousGrades, int parentsEducationLevel) {
        this.userId = "U" + userIdCounter; // Generate userId based on counter
        this.userName = userName;
        this.studyHours = studyHours;
        this.attendanceRate = attendanceRate;
        this.previousGrades = previousGrades;
        this.parentsEducationLevel = parentsEducationLevel;
        userIdCounter++;
    }

    public double getStudyHours() {
        return studyHours;
    }

    public double getAttendanceRate() {
        return attendanceRate;
    }

    public double getPreviousGrades() {
        return previousGrades;
    }

    public int getParentsEducationLevel() {
        return parentsEducationLevel;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }


    @Override
    public String toString() {
        return "User : " + userName + " (ID: " + userId + ")\n" +
                "Study Hours: " + studyHours + "\n" +
                "Attendance Rate: " + attendanceRate + "%\n" +
                "Previous Grades: " + previousGrades + "\n" +
                "Parents' Education Level: " + parentsEducationLevel
                + "\n";
    }
}

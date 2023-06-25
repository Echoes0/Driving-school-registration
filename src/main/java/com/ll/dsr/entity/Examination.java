package com.ll.dsr.entity;


public class Examination {

  private long examNumber;
  private long gradeNumber;
  private long examAppointmentNumber;
  private String examSubjects;
  private java.sql.Timestamp examTime;
  private String testLocation;


  public long getExamNumber() {
    return examNumber;
  }

  public void setExamNumber(long examNumber) {
    this.examNumber = examNumber;
  }


  public long getGradeNumber() {
    return gradeNumber;
  }

  public void setGradeNumber(long gradeNumber) {
    this.gradeNumber = gradeNumber;
  }


  public long getExamAppointmentNumber() {
    return examAppointmentNumber;
  }

  public void setExamAppointmentNumber(long examAppointmentNumber) {
    this.examAppointmentNumber = examAppointmentNumber;
  }


  public String getExamSubjects() {
    return examSubjects;
  }

  public void setExamSubjects(String examSubjects) {
    this.examSubjects = examSubjects;
  }


  public java.sql.Timestamp getExamTime() {
    return examTime;
  }

  public void setExamTime(java.sql.Timestamp examTime) {
    this.examTime = examTime;
  }


  public String getTestLocation() {
    return testLocation;
  }

  public void setTestLocation(String testLocation) {
    this.testLocation = testLocation;
  }

}

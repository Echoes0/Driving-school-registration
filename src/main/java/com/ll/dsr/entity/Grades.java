package com.ll.dsr.entity;


public class Grades {

  private long gradeNumber;
  private long examNumber;
  private long studentNumber;
  private java.sql.Timestamp publicityTime;
  private long grades;


  public long getGradeNumber() {
    return gradeNumber;
  }

  public void setGradeNumber(long gradeNumber) {
    this.gradeNumber = gradeNumber;
  }


  public long getExamNumber() {
    return examNumber;
  }

  public void setExamNumber(long examNumber) {
    this.examNumber = examNumber;
  }


  public long getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(long studentNumber) {
    this.studentNumber = studentNumber;
  }


  public java.sql.Timestamp getPublicityTime() {
    return publicityTime;
  }

  public void setPublicityTime(java.sql.Timestamp publicityTime) {
    this.publicityTime = publicityTime;
  }


  public long getGrades() {
    return grades;
  }

  public void setGrades(long grades) {
    this.grades = grades;
  }

}

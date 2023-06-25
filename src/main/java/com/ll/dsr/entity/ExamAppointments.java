package com.ll.dsr.entity;

/**
 * 考试预约
 */
public class ExamAppointments {

  private long examAppointmentNumber;
  private long examNumber;
  private long studentNumber;
  private java.sql.Timestamp appointmentTime;

  public long getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(long studentNumber) {
    this.studentNumber = studentNumber;
  }

  public long getExamAppointmentNumber() {
    return examAppointmentNumber;
  }

  public void setExamAppointmentNumber(long examAppointmentNumber) {
    this.examAppointmentNumber = examAppointmentNumber;
  }


  public long getExamNumber() {
    return examNumber;
  }

  public void setExamNumber(long examNumber) {
    this.examNumber = examNumber;
  }


  public java.sql.Timestamp getAppointmentTime() {
    return appointmentTime;
  }

  public void setAppointmentTime(java.sql.Timestamp appointmentTime) {
    this.appointmentTime = appointmentTime;
  }

}

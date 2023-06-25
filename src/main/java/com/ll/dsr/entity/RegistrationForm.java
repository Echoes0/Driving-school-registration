package com.ll.dsr.entity;


import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Timestamp;

/**
 * 报名表
 */
public class RegistrationForm {

  @TableId
  private long registrationFormNumber;
  private java.sql.Timestamp registrationTime;
  private long studentNumber;

  public RegistrationForm(long registrationFormNumber, Timestamp registrationTime, long studentNumber) {
    this.registrationFormNumber = registrationFormNumber;
    this.registrationTime = registrationTime;
    this.studentNumber = studentNumber;
  }

  public long getRegistrationFormNumber() {
    return registrationFormNumber;
  }

  public void setRegistrationFormNumber(long registrationFormNumber) {
    this.registrationFormNumber = registrationFormNumber;
  }


  public java.sql.Timestamp getRegistrationTime() {
    return registrationTime;
  }

  public void setRegistrationTime(java.sql.Timestamp registrationTime) {
    this.registrationTime = registrationTime;
  }


  public long getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(long studentNumber) {
    this.studentNumber = studentNumber;
  }

}

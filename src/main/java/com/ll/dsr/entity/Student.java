package com.ll.dsr.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Student {

  @TableId
  private long studentNumber;
  private long auditNumber;
  private long registrationFormNumber;
  private long medicalExaminationFormNumber;
  private long orderNumber;
  private String learnerName;
  private long participantAge;
  private String learnerOfMobilePhoneNumber;
  private String studentIdCard;
  private String auditStatus;
  private String participantGender;
  private java.sql.Timestamp trainingStartTime;
  private String password;

  public Student(long studentNumber, String password) {
    this.studentNumber = studentNumber;
    this.password = password;
  }

  public long getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(long studentNumber) {
    this.studentNumber = studentNumber;
  }


  public long getAuditNumber() {
    return auditNumber;
  }

  public void setAuditNumber(long auditNumber) {
    this.auditNumber = auditNumber;
  }


  public long getRegistrationFormNumber() {
    return registrationFormNumber;
  }

  public void setRegistrationFormNumber(long registrationFormNumber) {
    this.registrationFormNumber = registrationFormNumber;
  }


  public long getMedicalExaminationFormNumber() {
    return medicalExaminationFormNumber;
  }

  public void setMedicalExaminationFormNumber(long medicalExaminationFormNumber) {
    this.medicalExaminationFormNumber = medicalExaminationFormNumber;
  }


  public long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public String getLearnerName() {
    return learnerName;
  }

  public void setLearnerName(String learnerName) {
    this.learnerName = learnerName;
  }


  public long getParticipantAge() {
    return participantAge;
  }

  public void setParticipantAge(long participantAge) {
    this.participantAge = participantAge;
  }


  public String getLearnerOfMobilePhoneNumber() {
    return learnerOfMobilePhoneNumber;
  }

  public void setLearnerOfMobilePhoneNumber(String learnerOfMobilePhoneNumber) {
    this.learnerOfMobilePhoneNumber = learnerOfMobilePhoneNumber;
  }


  public String getStudentIdCard() {
    return studentIdCard;
  }

  public void setStudentIdCard(String studentIdCard) {
    this.studentIdCard = studentIdCard;
  }


  public String getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public String getParticipantGender() {
    return participantGender;
  }

  public void setParticipantGender(String participantGender) {
    this.participantGender = participantGender;
  }


  public java.sql.Timestamp getTrainingStartTime() {
    return trainingStartTime;
  }

  public void setTrainingStartTime(java.sql.Timestamp trainingStartTime) {
    this.trainingStartTime = trainingStartTime;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}

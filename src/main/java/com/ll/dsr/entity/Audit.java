package com.ll.dsr.entity;

/**
 * 订单
 */
public class Audit {

  private long auditNumber;
  private long studentNumber;
  private long administratorNumber;
  private java.sql.Timestamp reviewTime;
  private String theReasonForTheFailureOfTheReview;


  public long getAuditNumber() {
    return auditNumber;
  }

  public void setAuditNumber(long auditNumber) {
    this.auditNumber = auditNumber;
  }


  public long getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(long studentNumber) {
    this.studentNumber = studentNumber;
  }


  public long getAdministratorNumber() {
    return administratorNumber;
  }

  public void setAdministratorNumber(long administratorNumber) {
    this.administratorNumber = administratorNumber;
  }


  public java.sql.Timestamp getReviewTime() {
    return reviewTime;
  }

  public void setReviewTime(java.sql.Timestamp reviewTime) {
    this.reviewTime = reviewTime;
  }


  public String getTheReasonForTheFailureOfTheReview() {
    return theReasonForTheFailureOfTheReview;
  }

  public void setTheReasonForTheFailureOfTheReview(String theReasonForTheFailureOfTheReview) {
    this.theReasonForTheFailureOfTheReview = theReasonForTheFailureOfTheReview;
  }

}

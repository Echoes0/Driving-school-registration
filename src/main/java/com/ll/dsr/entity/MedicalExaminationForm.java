package com.ll.dsr.entity;

/**
 * 体检表
 */
public class MedicalExaminationForm {

  private long medicalExaminationFormNumber;
  private double height;
  private double weight;
  private String motorFunctionOfTheExtremities;
  private String trunkMotorFunction;
  private String examinationAndDeterminationOfPhysiologicalDefects;
  private String unequalLengthExaminationOfBothLowerExtremities;
  private String bloodPressure;
  private String neurologicalDisorders;
  private String mentalDisorders;
  private String nakedEyeVision;
  private String correctiveVisionExamination;
  private String colorDiscrimination;
  private java.sql.Timestamp medicalExaminationTime;
  private long studentNumber;


  public long getMedicalExaminationFormNumber() {
    return medicalExaminationFormNumber;
  }

  public void setMedicalExaminationFormNumber(long medicalExaminationFormNumber) {
    this.medicalExaminationFormNumber = medicalExaminationFormNumber;
  }


  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public String getMotorFunctionOfTheExtremities() {
    return motorFunctionOfTheExtremities;
  }

  public void setMotorFunctionOfTheExtremities(String motorFunctionOfTheExtremities) {
    this.motorFunctionOfTheExtremities = motorFunctionOfTheExtremities;
  }


  public String getTrunkMotorFunction() {
    return trunkMotorFunction;
  }

  public void setTrunkMotorFunction(String trunkMotorFunction) {
    this.trunkMotorFunction = trunkMotorFunction;
  }


  public String getExaminationAndDeterminationOfPhysiologicalDefects() {
    return examinationAndDeterminationOfPhysiologicalDefects;
  }

  public void setExaminationAndDeterminationOfPhysiologicalDefects(String examinationAndDeterminationOfPhysiologicalDefects) {
    this.examinationAndDeterminationOfPhysiologicalDefects = examinationAndDeterminationOfPhysiologicalDefects;
  }


  public String getUnequalLengthExaminationOfBothLowerExtremities() {
    return unequalLengthExaminationOfBothLowerExtremities;
  }

  public void setUnequalLengthExaminationOfBothLowerExtremities(String unequalLengthExaminationOfBothLowerExtremities) {
    this.unequalLengthExaminationOfBothLowerExtremities = unequalLengthExaminationOfBothLowerExtremities;
  }


  public String getBloodPressure() {
    return bloodPressure;
  }

  public void setBloodPressure(String bloodPressure) {
    this.bloodPressure = bloodPressure;
  }


  public String getNeurologicalDisorders() {
    return neurologicalDisorders;
  }

  public void setNeurologicalDisorders(String neurologicalDisorders) {
    this.neurologicalDisorders = neurologicalDisorders;
  }


  public String getMentalDisorders() {
    return mentalDisorders;
  }

  public void setMentalDisorders(String mentalDisorders) {
    this.mentalDisorders = mentalDisorders;
  }


  public String getNakedEyeVision() {
    return nakedEyeVision;
  }

  public void setNakedEyeVision(String nakedEyeVision) {
    this.nakedEyeVision = nakedEyeVision;
  }


  public String getCorrectiveVisionExamination() {
    return correctiveVisionExamination;
  }

  public void setCorrectiveVisionExamination(String correctiveVisionExamination) {
    this.correctiveVisionExamination = correctiveVisionExamination;
  }


  public String getColorDiscrimination() {
    return colorDiscrimination;
  }

  public void setColorDiscrimination(String colorDiscrimination) {
    this.colorDiscrimination = colorDiscrimination;
  }


  public java.sql.Timestamp getMedicalExaminationTime() {
    return medicalExaminationTime;
  }

  public void setMedicalExaminationTime(java.sql.Timestamp medicalExaminationTime) {
    this.medicalExaminationTime = medicalExaminationTime;
  }


  public long getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(long studentNumber) {
    this.studentNumber = studentNumber;
  }

}

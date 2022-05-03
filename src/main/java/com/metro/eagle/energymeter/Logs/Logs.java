package com.metro.eagle.energymeter.Logs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Logs {
    @Id
    private Long indexNum;
    private String date ;
    private String time;
    private String timestamp;
    private String finalVoltageDC;
    private String finalCurrentDC;
    private String finalPowerDC;
    private String netEnergyDC;
    private String importEnergyDC;
    private String exportEnergyDC;
    private String finalRMSVoltageAC;
    private String finalRMSCurrentAC;
    private String realPowerAC;
    private String apparentPowerAC;
    private String powerFactorAC;
    private String netEnergyAC;
    private String importEnergyAC;
    private String exportEnergyAC;
    private String frequencyAC;

    public Logs() {
    }

    public Logs(Long indexNum, String date, String time, String timestamp, String finalVoltageDC,
                String finalCurrentDC, String finalPowerDC, String netEnergyDC, String importEnergyDC,
                String exportEnergyDC, String finalRMSVoltageAC, String finalRMSCurrentAC,
                String realPowerAC, String apparentPowerAC, String powerFactorAC, String netEnergyAC,
                String importEnergyAC, String exportEnergyAC, String frequencyAC) {
        this.indexNum = indexNum;
        this.date = date;
        this.time = time;
        this.timestamp = timestamp;
        this.finalVoltageDC = finalVoltageDC;
        this.finalCurrentDC = finalCurrentDC;
        this.finalPowerDC = finalPowerDC;
        this.netEnergyDC = netEnergyDC;
        this.importEnergyDC = importEnergyDC;
        this.exportEnergyDC = exportEnergyDC;
        this.finalRMSVoltageAC = finalRMSVoltageAC;
        this.finalRMSCurrentAC = finalRMSCurrentAC;
        this.realPowerAC = realPowerAC;
        this.apparentPowerAC = apparentPowerAC;
        this.powerFactorAC = powerFactorAC;
        this.netEnergyAC = netEnergyAC;
        this.importEnergyAC = importEnergyAC;
        this.exportEnergyAC = exportEnergyAC;
        this.frequencyAC = frequencyAC;
    }

    public Long getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(Long indexNum) {
        this.indexNum = indexNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFinalVoltageDC() {
        return finalVoltageDC;
    }

    public void setFinalVoltageDC(String finalVoltageDC) {
        this.finalVoltageDC = finalVoltageDC;
    }

    public String getFinalCurrentDC() {
        return finalCurrentDC;
    }

    public void setFinalCurrentDC(String finalCurrentDC) {
        this.finalCurrentDC = finalCurrentDC;
    }

    public String getFinalPowerDC() {
        return finalPowerDC;
    }

    public void setFinalPowerDC(String finalPowerDC) {
        this.finalPowerDC = finalPowerDC;
    }

    public String getNetEnergyDC() {
        return netEnergyDC;
    }

    public void setNetEnergyDC(String netEnergyDC) {
        this.netEnergyDC = netEnergyDC;
    }

    public String getImportEnergyDC() {
        return importEnergyDC;
    }

    public void setImportEnergyDC(String importEnergyDC) {
        this.importEnergyDC = importEnergyDC;
    }

    public String getExportEnergyDC() {
        return exportEnergyDC;
    }

    public void setExportEnergyDC(String exportEnergyDC) {
        this.exportEnergyDC = exportEnergyDC;
    }

    public String getFinalRMSVoltageAC() {
        return finalRMSVoltageAC;
    }

    public void setFinalRMSVoltageAC(String finalRMSVoltageAC) {
        this.finalRMSVoltageAC = finalRMSVoltageAC;
    }

    public String getFinalRMSCurrentAC() {
        return finalRMSCurrentAC;
    }

    public void setFinalRMSCurrentAC(String finalRMSCurrentAC) {
        this.finalRMSCurrentAC = finalRMSCurrentAC;
    }

    public String getRealPowerAC() {
        return realPowerAC;
    }

    public void setRealPowerAC(String realPowerAC) {
        this.realPowerAC = realPowerAC;
    }

    public String getApparentPowerAC() {
        return apparentPowerAC;
    }

    public void setApparentPowerAC(String apparentPowerAC) {
        this.apparentPowerAC = apparentPowerAC;
    }

    public String getPowerFactorAC() {
        return powerFactorAC;
    }

    public void setPowerFactorAC(String powerFactorAC) {
        this.powerFactorAC = powerFactorAC;
    }

    public String getNetEnergyAC() {
        return netEnergyAC;
    }

    public void setNetEnergyAC(String netEnergyAC) {
        this.netEnergyAC = netEnergyAC;
    }

    public String getImportEnergyAC() {
        return importEnergyAC;
    }

    public void setImportEnergyAC(String importEnergyAC) {
        this.importEnergyAC = importEnergyAC;
    }

    public String getExportEnergyAC() {
        return exportEnergyAC;
    }

    public void setExportEnergyAC(String exportEnergyAC) {
        this.exportEnergyAC = exportEnergyAC;
    }

    public String getFrequencyAC() {
        return frequencyAC;
    }

    public void setFrequencyAC(String frequencyAC) {
        this.frequencyAC = frequencyAC;
    }
}

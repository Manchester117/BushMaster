package com.bushmaster.architecture.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class SampleResultInfo implements Serializable {
    private Timestamp timeStamp;
    private String samplerLabel;
    private int samplerCount;
    private Double meanTime;
    private Long minTime;
    private Long maxTime;
    private Double standardDeviation;
    private Double errorPercentage;
    private Double requestRate;
    private Double receiveKBPerSecond;
    private Double sentKBPerSecond;
    private Double avgPageBytes;
    private Integer threadCount;
    private Integer resultId;

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSamplerLabel() {
        return samplerLabel;
    }

    public void setSamplerLabel(String samplerLabel) {
        this.samplerLabel = samplerLabel;
    }

    public int getSamplerCount() {
        return samplerCount;
    }

    public void setSamplerCount(int samplerCount) {
        this.samplerCount = samplerCount;
    }

    public Double getMeanTime() {
        return meanTime;
    }

    public void setMeanTime(Double meanTime) {
        BigDecimal bigDecimal = new BigDecimal(meanTime);
        this.meanTime = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Long getMinTime() {
        return minTime;
    }

    public void setMinTime(Long minTime) {
        this.minTime = minTime;
    }

    public Long getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Long maxTime) {
        this.maxTime = maxTime;
    }

    public Double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(Double standardDeviation) {
        // 保留2位小数
        BigDecimal bigDecimal = new BigDecimal(standardDeviation);
        this.standardDeviation = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getErrorPercentage() {
        return errorPercentage;
    }

    public void setErrorPercentage(Double errorPercentage) {
        this.errorPercentage = errorPercentage;
    }

    public Double getRequestRate() {
        return requestRate;
    }

    public void setRequestRate(Double requestRate) {
        BigDecimal bigDecimal = new BigDecimal(requestRate);
        this.requestRate = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getReceiveKBPerSecond() {
        return receiveKBPerSecond;
    }

    public void setReceiveKBPerSecond(Double receiveKBPerSecond) {
        BigDecimal bigDecimal = new BigDecimal(receiveKBPerSecond);
        this.receiveKBPerSecond = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getSentKBPerSecond() {
        return sentKBPerSecond;
    }

    public void setSentKBPerSecond(Double sentKBPerSecond) {
        BigDecimal bigDecimal = new BigDecimal(sentKBPerSecond);
        this.sentKBPerSecond = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getAvgPageBytes() {
        return avgPageBytes;
    }

    public void setAvgPageBytes(Double avgPageBytes) {
        BigDecimal bigDecimal = new BigDecimal(avgPageBytes);
        this.avgPageBytes = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Integer getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(Integer threadCount) {
        this.threadCount = threadCount;
    }

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    @Override
    public String toString() {
        return "SampleResultInfo{" +
                "timeStamp=" + timeStamp +
                ", samplerLabel='" + samplerLabel + '\'' +
                ", samplerCount=" + samplerCount +
                ", meanTime=" + meanTime +
                ", minTime=" + minTime +
                ", maxTime=" + maxTime +
                ", standardDeviation=" + standardDeviation +
                ", errorPercentage=" + errorPercentage +
                ", requestRate=" + requestRate +
                ", receiveKBPerSecond=" + receiveKBPerSecond +
                ", sentKBPerSecond=" + sentKBPerSecond +
                ", avgPageBytes=" + avgPageBytes +
                ", threadCount=" + threadCount +
                ", resultId=" + resultId +
                '}';
    }
}

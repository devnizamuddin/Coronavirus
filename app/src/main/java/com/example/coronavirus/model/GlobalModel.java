package com.example.coronavirus.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GlobalModel implements Serializable {

    @SerializedName("updated")
    @Expose
    private Double updated;
    @SerializedName("cases")
    @Expose
    private Integer cases;
    @SerializedName("todayCases")
    @Expose
    private Integer todayCases;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("todayDeaths")
    @Expose
    private Integer todayDeaths;
    @SerializedName("recovered")
    @Expose
    private Integer recovered;
    @SerializedName("active")
    @Expose
    private Integer active;
    @SerializedName("critical")
    @Expose
    private Integer critical;
    @SerializedName("casesPerOneMillion")
    @Expose
    private Integer casesPerOneMillion;
    @SerializedName("deathsPerOneMillion")
    @Expose
    private Integer deathsPerOneMillion;
    @SerializedName("tests")
    @Expose
    private Integer tests;
    @SerializedName("testsPerOneMillion")
    @Expose
    private Double testsPerOneMillion;
    @SerializedName("affectedCountries")
    @Expose
    private Integer affectedCountries;

    public Double getUpdated() {
        return updated;
    }

    public void setUpdated(Double updated) {
        this.updated = updated;
    }

    public Integer getCases() {
        return cases;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }

    public Integer getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(Integer todayCases) {
        this.todayCases = todayCases;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(Integer todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(Integer casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public Integer getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Integer deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public Integer getTests() {
        return tests;
    }

    public void setTests(Integer tests) {
        this.tests = tests;
    }

    public Double getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(Double testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public Integer getAffectedCountries() {
        return affectedCountries;
    }

    public void setAffectedCountries(Integer affectedCountries) {
        this.affectedCountries = affectedCountries;
    }
}

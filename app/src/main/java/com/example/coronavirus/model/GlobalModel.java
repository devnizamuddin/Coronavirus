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
    @SerializedName("todayRecovered")
    @Expose
    private Double todayRecovered;
    @SerializedName("active")
    @Expose
    private Double active;
    @SerializedName("critical")
    @Expose
    private Double critical;
    @SerializedName("casesPerOneMillion")
    @Expose
    private Double casesPerOneMillion;
    @SerializedName("deathsPerOneMillion")
    @Expose
    private Double deathsPerOneMillion;
    @SerializedName("tests")
    @Expose
    private Double tests;
    @SerializedName("testsPerOneMillion")
    @Expose
    private Double testsPerOneMillion;
    @SerializedName("population")
    @Expose
    private Double population;
    @SerializedName("oneCasePerPeople")
    @Expose
    private Double oneCasePerPeople;
    @SerializedName("oneDeathPerPeople")
    @Expose
    private Double oneDeathPerPeople;
    @SerializedName("oneTestPerPeople")
    @Expose
    private Double oneTestPerPeople;
    @SerializedName("activePerOneMillion")
    @Expose
    private Double activePerOneMillion;
    @SerializedName("recoveredPerOneMillion")
    @Expose
    private Double recoveredPerOneMillion;
    @SerializedName("criticalPerOneMillion")
    @Expose
    private Double criticalPerOneMillion;
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

    public Double getTodayRecovered() {
        return todayRecovered;
    }

    public void setTodayRecovered(Double todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    public Double getActive() {
        return active;
    }

    public void setActive(Double active) {
        this.active = active;
    }

    public Double getCritical() {
        return critical;
    }

    public void setCritical(Double critical) {
        this.critical = critical;
    }

    public Double getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(Double casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public Double getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Double deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public Double getTests() {
        return tests;
    }

    public void setTests(Double tests) {
        this.tests = tests;
    }

    public Double getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(Double testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Double getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    public void setOneCasePerPeople(Double oneCasePerPeople) {
        this.oneCasePerPeople = oneCasePerPeople;
    }

    public Double getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    public void setOneDeathPerPeople(Double oneDeathPerPeople) {
        this.oneDeathPerPeople = oneDeathPerPeople;
    }

    public Double getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    public void setOneTestPerPeople(Double oneTestPerPeople) {
        this.oneTestPerPeople = oneTestPerPeople;
    }

    public Double getActivePerOneMillion() {
        return activePerOneMillion;
    }

    public void setActivePerOneMillion(Double activePerOneMillion) {
        this.activePerOneMillion = activePerOneMillion;
    }

    public Double getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    public void setRecoveredPerOneMillion(Double recoveredPerOneMillion) {
        this.recoveredPerOneMillion = recoveredPerOneMillion;
    }

    public Double getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    public void setCriticalPerOneMillion(Double criticalPerOneMillion) {
        this.criticalPerOneMillion = criticalPerOneMillion;
    }

    public Integer getAffectedCountries() {
        return affectedCountries;
    }

    public void setAffectedCountries(Integer affectedCountries) {
        this.affectedCountries = affectedCountries;
    }

}

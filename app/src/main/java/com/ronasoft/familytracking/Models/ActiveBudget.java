package com.ronasoft.familytracking.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "Active_budget")
public class ActiveBudget {
    @DatabaseField(id = true,columnName = "id_active_budget")
    Integer idActiveBudget;
    @DatabaseField(columnName = "id_active_budget",throwIfNull = true)
    String description;
    @DatabaseField(columnName = "expected_expiration_date",throwIfNull = true)
    Date expectedExpirationDate;
    @DatabaseField(columnName = "execution date",throwIfNull = false)
    Date executionDate;
    @DatabaseField(columnName = "item_before",throwIfNull = true)
    Float itemBefore;
    @DatabaseField(columnName = "item_after",throwIfNull = false)
    Float itemAfter;

    public Integer getIdActiveBudget() {
        return idActiveBudget;
    }

    public void setIdActiveBudget(Integer idActiveBudget) {
        this.idActiveBudget = idActiveBudget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpectedExpirationDate() {
        return expectedExpirationDate;
    }

    public void setExpectedExpirationDate(Date expectedExpirationDate) {
        this.expectedExpirationDate = expectedExpirationDate;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public Float getItemBefore() {
        return itemBefore;
    }

    public void setItemBefore(Float itemBefore) {
        this.itemBefore = itemBefore;
    }

    public Float getItemAfter() {
        return itemAfter;
    }

    public void setItemAfter(Float itemAfter) {
        this.itemAfter = itemAfter;
    }

    @Override
    public String toString() {
        return "ActiveBudget{" +
                "idActiveBudget=" + idActiveBudget +
                ", description='" + description + '\'' +
                ", expectedExpirationDate=" + expectedExpirationDate +
                ", executionDate=" + executionDate +
                ", itemBefore=" + itemBefore +
                ", itemAfter=" + itemAfter +
                '}';
    }

    public ActiveBudget() {
    }

    public ActiveBudget(String description, Date expectedExpirationDate, Float itemBefore) {
        this.description = description;
        this.expectedExpirationDate = expectedExpirationDate;
        this.itemBefore = itemBefore;
    }
}

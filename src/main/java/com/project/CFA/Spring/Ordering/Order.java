package com.project.CFA.Spring.Ordering;

import java.time.LocalDateTime;

public class Order {

    private Integer orderID;
    private String title;
    private LocalDateTime completedOn;
    private Integer total;

    public Order(Integer orderID, String title, LocalDateTime completedOn, Integer total) {
        this.orderID = orderID;
        this.title = title;
        this.completedOn = completedOn;
        this.total = total;
    }

    public Integer getID() {
        return orderID;
    }

    public void setID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(LocalDateTime completedOn) {
        this.completedOn = completedOn;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", title='" + title + '/' +
                ", completedOn= " + completedOn +
                ", total=" + total +
                '}';
    }

}
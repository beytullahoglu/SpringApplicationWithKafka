package com.sh.casestudy;

import java.text.SimpleDateFormat;  
import java.util.Date;

public class MappedPackage {
    
    Long id;
    String createdAt;
    String lastUpdatedAt;
    Integer collectionDuration;
    Integer deliveryDuration;
    Integer eta;
    Integer leadTime;
    Boolean orderInTime;

    MappedPackage(){}

    MappedPackage(Package p){
        this.id = p.getId();
        this.createdAt = p.getCreated_at();
        this.lastUpdatedAt = p.getLast_updated_at();
        this.eta = p.getEta();

        if(p.getCollected() == 0){
            this.collectionDuration = null;
        }
        else{
            try{
                Date d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(p.created_at);
                Date d2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(p.collected_at);
                this.collectionDuration = Integer.valueOf((int)(d2.getTime() - d1.getTime())/(1000*60));
            }
            catch(java.text.ParseException exception){
                this.collectionDuration = null;
                System.out.println(exception.toString());
            }
        }

        if(!p.getStatus().equals(new String("COMPLETED"))){
            this.deliveryDuration = null;
            this.leadTime = null;
            this.orderInTime = null;
        }
        else{
            try{
                Date d1 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss").parse(p.picked_up_at);
                Date d2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(p.created_at);
                Date d3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(p.completed_at);
                this.deliveryDuration = Integer.valueOf((int)(d3.getTime() - d1.getTime())/(1000*60));
                this.leadTime = Integer.valueOf((int)(d3.getTime() - d2.getTime())/(1000*60));
                if(this.leadTime < eta){
                    this.orderInTime = true;
                }
                else{
                    this.orderInTime = false;
                }
            }
            catch(java.text.ParseException exception){
                this.deliveryDuration = null;
                System.out.println(exception.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "MappedPackage [collectionDuration=" + collectionDuration + ", createdAt=" + createdAt
                + ", deliveryDuration=" + deliveryDuration + ", eta=" + eta + ", id=" + id + ", lastUpdatedAt="
                + lastUpdatedAt + ", leadTime=" + leadTime + ", orderInTime=" + orderInTime + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Integer getCollectionDuration() {
        return collectionDuration;
    }

    public void setCollectionDuration(Integer collectionDuration) {
        this.collectionDuration = collectionDuration;
    }

    public Integer getDeliveryDuration() {
        return deliveryDuration;
    }

    public void setDeliveryDuration(Integer deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public Boolean getOrderInTime() {
        return orderInTime;
    }

    public void setOrderInTime(Boolean orderInTime) {
        this.orderInTime = orderInTime;
    }
}


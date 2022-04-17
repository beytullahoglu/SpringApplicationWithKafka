package com.sh.casestudy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Package {
    
    @Id Long id;
    String arrival_for_delivery_at;
    String arrival_for_pickup_at;
    String cancel_reason;
    Integer cancelled;
    String completed_at;
    String created_at;
    Long customer_id;
    String in_delivery_at;
    String last_updated_at;
    Integer eta;
    String status;
    Long store_id;
    Long origin_address_id;
    String type;
    String waiting_for_assignment_at;
    Long user_id;
    Integer collected;
    String collected_at;
    String cancelled_at;
    String picked_up_at;
    Integer reassigned;
    Long order_id;
    String delivery_date;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getArrival_for_delivery_at() {
        return arrival_for_delivery_at;
    }
    public void setArrival_for_delivery_at(String arrival_for_delivery_at) {
        this.arrival_for_delivery_at = arrival_for_delivery_at;
    }
    public String getArrival_for_pickup_at() {
        return arrival_for_pickup_at;
    }
    public void setArrival_for_pickup_at(String arrival_for_pickup_at) {
        this.arrival_for_pickup_at = arrival_for_pickup_at;
    }
    public String getCancel_reason() {
        return cancel_reason;
    }
    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }
    public Integer getCancelled() {
        return cancelled;
    }
    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }
    public String getCompleted_at() {
        return completed_at;
    }
    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public Long getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
    public String getIn_delivery_at() {
        return in_delivery_at;
    }
    public void setIn_delivery_at(String in_delivery_at) {
        this.in_delivery_at = in_delivery_at;
    }
    public String getLast_updated_at() {
        return last_updated_at;
    }
    public void setLast_updated_at(String last_updated_at) {
        this.last_updated_at = last_updated_at;
    }
    public Integer getEta() {
        return eta;
    }
    public void setEta(Integer eta) {
        this.eta = eta;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getStore_id() {
        return store_id;
    }
    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }
    public Long getOrigin_address_id() {
        return origin_address_id;
    }
    public void setOrigin_address_id(Long origin_address_id) {
        this.origin_address_id = origin_address_id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getWaiting_for_assignment_at() {
        return waiting_for_assignment_at;
    }
    public void setWaiting_for_assignment_at(String waiting_for_assignment_at) {
        this.waiting_for_assignment_at = waiting_for_assignment_at;
    }
    public Long getUser_id() {
        return user_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public Integer getCollected() {
        return collected;
    }
    public void setCollected(Integer collected) {
        this.collected = collected;
    }
    public String getCollected_at() {
        return collected_at;
    }
    public void setCollected_at(String collected_at) {
        this.collected_at = collected_at;
    }
    public String getCancelled_at() {
        return cancelled_at;
    }
    public void setCancelled_at(String cancelled_at) {
        this.cancelled_at = cancelled_at;
    }
    public String getPicked_up_at() {
        return picked_up_at;
    }
    public void setPicked_up_at(String picked_up_at) {
        this.picked_up_at = picked_up_at;
    }
    public Integer getReassigned() {
        return reassigned;
    }
    public void setReassigned(Integer reassigned) {
        this.reassigned = reassigned;
    }
    public Long getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
    public String getDelivery_date() {
        return delivery_date;
    }
    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }
    
    
    

}

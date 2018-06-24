package com.mall.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 商家
 */
@Entity
@Table(name = "merchant")
public class Merchant {

    // 唯一标识 ID
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "native")
    private int id;

    // 商家名称
    private String merchantName;

    // 店铺地址
    private String mechantPlace;

    // 店铺描述
    private String mechantDesc;

    // 后台登陆密码
    private String adminPass;

    @Column(updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMechantPlace() {
        return mechantPlace;
    }

    public void setMechantPlace(String mechantPlace) {
        this.mechantPlace = mechantPlace;
    }

    public String getMechantDesc() {
        return mechantDesc;
    }

    public void setMechantDesc(String mechantDesc) {
        this.mechantDesc = mechantDesc;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}

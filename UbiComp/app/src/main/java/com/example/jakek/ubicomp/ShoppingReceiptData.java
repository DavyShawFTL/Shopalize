package com.example.jakek.ubicomp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom on 22/11/2017.
 */

public class ShoppingReceiptData {
    private String date;
    private String receiptData;
    private String absolutePath;


    public ShoppingReceiptData(){

    }


    public ShoppingReceiptData(String receiptData, String absolutePath){
        this.date = new SimpleDateFormat(" HH:mm dd/MM/yyyy").format(new Date());
        this.receiptData = receiptData;
        this.absolutePath = absolutePath;
    }


    public String getDate(){
        return this.date;
    }

    public void setDate(){
        this.date = new SimpleDateFormat(" HH:mm dd/MM/yyyy").format(new Date());
    }

    public String getReceiptData(){
        return this.receiptData;
    }

    public void setReceiptData(String receiptData){
        this.receiptData = receiptData;
    }

    public String getAbsolutePath(){
        return this.absolutePath;
    }

    public void setAbsolutePath(String absolutePath){
        this.absolutePath = absolutePath;
    }


}

package com.liml.innerclass;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                public TrackingSlip(String s){
                    id = s;
                }
                public String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }
    public void track(){
        internalTracking(true);
    }
    public static void main(String[] args){
        Parcel6 parcel = new Parcel6();
        parcel.track();
    }
}

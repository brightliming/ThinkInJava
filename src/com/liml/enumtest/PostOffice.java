package com.liml.enumtest;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

import java.util.Iterator;

/**
 * Created by bright on 16-5-5.
 */
class Mail {
    enum GeneralDelivery {YES,NO1,NO2,NO3,NO4,NO5}
    enum Scannablility {UNSCANNABLE,YES1,YES2,YES3,YES4}
    enum Readability {ILLEGIBLE,YES1,YES2,YES3,YES4}
    enum Address {INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6}
    enum ReturnAdrress {MISSING,OK1,OK2,OK3,OK4,OK5}
    GeneralDelivery generalDelivery;
    Scannablility scannablility;
    Readability readability;
    Address address;
    ReturnAdrress returnAdrress;
    static long counter = 0;
    long id = counter++;
    public String toString(){return "Mail "+id;}
    public String details(){
        return toString() +
                ", General Delivery:"+generalDelivery+
                ", Address Scannablility:"+scannablility+
                ", Address Readability:"+readability+
                ", Address Address: "+address+
                ", Return Address: "+returnAdrress;
    }
    public static Mail randomMail(){
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.class);
        m.scannablility = Enums.random(Scannablility.class);
        m.readability = Enums.random(Readability.class);
        m.address = Enums.random(Address.class);
        m.returnAdrress = Enums.random(ReturnAdrress.class);
        return m;
    }
    public static Iterable<Mail> generator(final int count){
        return new Iterable<Mail>() {
            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    int n = count;
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
public class PostOffice{
    enum MailHandler{
        DENERAL_DELIVERY {
            boolean handler(Mail m){
                switch(m.generalDelivery){
                    case YES:
                        System.out.println("Using general delivery for "+m);
                        return true;
                    default: return false;
                }
            }
        },
        MACHINE_SCAN {
            boolean handler(Mail m){
                switch(m.scannablility){
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch(m.address){
                            case INCORRECT:return false;
                            default:
                                System.out.println("Delivery "+m+" aotumatically");
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION{
            boolean handler(Mail m){
                switch(m.readability){
                    case ILLEGIBLE:return false;
                    default:
                        switch(m.address){
                            case INCORRECT:return false;
                            default: System.out.println("Delivering "+m+"normally");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER{
            boolean handler(Mail m){
                switch(m.returnAdrress){
                    case MISSING:return false;
                    default:
                        System.out.println("Returning "+m+" sender");
                        return true;
                }
            }
        };
        abstract boolean handler(Mail m);
    }
    static void handler(Mail m){
        for(MailHandler mailHandler:MailHandler.values()){
            if(mailHandler.handler(m))
                return;
            System.out.println(m+"is a dead letter");
        }
    }
    public static void main(String[] args){
        for(Mail mail:Mail.generator(10)){
            System.out.println(mail.details());
            handler(mail);
            System.out.println("********");
        }
    }
}

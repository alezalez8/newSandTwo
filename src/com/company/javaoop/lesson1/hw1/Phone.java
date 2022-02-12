package com.company.javaoop.lesson1.hw1;

public class Phone {
    private String phoneNumber;
    private boolean isRegistered = false;


    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void registrationInNetwork(boolean isRegisteredFromNetwork) {
        this.isRegistered = isRegisteredFromNetwork;
    }

    private void incomingCall(Phone phone) {
        String incom = phone.getPhoneNumber();
        System.out.println("they call you from the phone: " + incom);

    }

    public void outgoingCall(Phone phone) {
        if (!isRegistered) {
            System.out.println("Your phone is offline");
            return;
        }
        if (!phone.isRegistered) {
            System.out.println("Remote phone is offline");
            return;
        }
        if (phoneNumber.equals(phone.getPhoneNumber())) {
            System.out.println("You can't make call yourself");
            return;
        }
        incomingCall(phone);
    }
}

class Network {

    public static void main(String[] args) {
        Phone phone1 = new Phone("+380501112233");
        Phone phone2 = new Phone("+380502223344");
        Phone phone3 = new Phone("+380503334455");
        Phone phone4 = new Phone("+380504445566");

        phone1.registrationInNetwork(true);
        phone2.registrationInNetwork(true);
        phone3.registrationInNetwork(true);
        phone4.registrationInNetwork(false);


        phone1.outgoingCall(phone2);  // they call you from the phone: +380502223344
        phone2.outgoingCall(phone3); //  they call you from the phone: +380503334455
        phone3.outgoingCall(phone1); //  they call you from the phone: +380501112233
        phone1.outgoingCall(phone1); //  You can't make call yourself
        phone2.outgoingCall(phone4); //  Remote phone is offline
        phone4.outgoingCall(phone3); //  Your phone is offline


    }

}

//   ^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\- ]{7,10}$
//    ^\+?([0-9]{2})?\(?[0-9]{3}\)?[0-9]{3}\-?[0-9]{2}\-?[0-9]{2}$
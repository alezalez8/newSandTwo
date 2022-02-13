package com.company.javaoop.lesson1.hw1.mobile;

public class Phone {
    private final String phoneNumber;
    private boolean isRegistered = false;
    private Network network;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void registration(Network network) {
        network.registrationPhone(this);
        isRegistered = true;
        this.network = network;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void outgoingCall(String outPhoneNumber) {
        if (outPhoneNumber.equals(phoneNumber)) {
            System.out.println("You can't make call yourself");
            return;
        }
        if (!isRegistered) {
            System.out.println("Your phone is offline");
            return;
        }

        System.out.println("You call from " + phoneNumber + " to " + outPhoneNumber);
        Phone phone = network.findPhone(outPhoneNumber);
        if(phone == null) {
            System.out.println("Remote phone is offline");
            return;
        }
        phone.incomingCall(outPhoneNumber);
    }

    private void incomingCall(String inPhoneNumber) {

        System.out.println("You received a call  from the phone: " + inPhoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

//-----------------------------------------------------------------------


//   ^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\- ]{7,10}$
//    ^\+?([0-9]{2})?\(?[0-9]{3}\)?[0-9]{3}\-?[0-9]{2}\-?[0-9]{2}$

/*
* +380501234567 call to phone number +380501238910
zzzzzz call from phone number +380501234567
* */

//    ^\+?([0-9]{2})?\(?[0-9]{3}\)?[0-9]{3}\-?[0-9]{2}\-?[0-9]{2}$  // check number, for future
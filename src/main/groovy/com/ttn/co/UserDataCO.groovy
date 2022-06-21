package com.ttn.co

import grails.validation.Validateable

class UserDataCO implements Validateable{
    String name
    int age
    String type

    static constraints = {

    }
}

package com.tothenew

import grails.gorm.transactions.Transactional

@Transactional
class HomeService {

    def serviceMethod() {
        print " hi  from service"
    }
}

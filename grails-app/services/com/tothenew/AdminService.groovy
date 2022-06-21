package com.tothenew

import grails.gorm.transactions.Transactional

@Transactional
class AdminService {

    def getData() {
        return "Arshad"
    }

    def returnTeamMember(){
        List list = ["Umesh", "Ashutosh", "Shivam", "Mirnal", "Manauwar"]
        return list
    }
}

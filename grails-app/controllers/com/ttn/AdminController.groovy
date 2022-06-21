package com.ttn

import com.tothenew.AdminService

class AdminController {

    static defaultAction = "myFirstAction"

    AdminService adminService

    def index() {
        String name = adminService.getData()
        List list = adminService.returnTeamMember()
        render(view: 'index', model: [userName: name, listOfEmployee: list])
    }

    def myFirstAction() {

        render "Hi from grails"
    }
}

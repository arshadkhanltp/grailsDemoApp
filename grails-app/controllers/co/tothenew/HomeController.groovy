package co.tothenew

import com.tothenew.HomeService

class HomeController {

    HomeService homeService

    def index() {
        homeService.serviceMethod()
        render "hi"
    }
}

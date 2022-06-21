package demoapp

class BootStrap {

    def init = { servletContext ->
        log.info("---APPLICATION IS UP")
        println ("Hello World")
    }
    def destroy = {
    }
}

package co.tothenew

import com.tothenew.AdminService
import com.ttn.co.UserDataCO
import com.ttn.dto.UserDataDTO

class DashboardController {

    AdminService adminService

    def index(UserDataCO userDataCO) {
        List list = adminService.returnTeamMember()
        log.info("User Data in dashboard/index action info::: ${userDataCO.properties}")
        log.error("User Data in dashboard/index action error::: ${userDataCO.properties}")
        log.warn("User Data in dashboard/index action warn::: ${userDataCO.properties}")
        UserDataDTO userDataDTO = new UserDataDTO(name: userDataCO.name,age: userDataCO.age)
        userDataDTO.type = userDataCO.type
        render(view: 'index', model: [userDataDTO:userDataDTO, listOfEmployee: list])
    }
}

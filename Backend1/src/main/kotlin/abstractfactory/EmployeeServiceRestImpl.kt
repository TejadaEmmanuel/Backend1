package abstractfactory

class EmployeeServiceRestImpl: IEmployeeService {
    private val employees = listOf("REST-Juan Carlos", "REST-Moises", "REST-Sandra")
    override fun getEmployees():  List<String> {
        return ApiRestEmployees.fetchAll()
    }
}
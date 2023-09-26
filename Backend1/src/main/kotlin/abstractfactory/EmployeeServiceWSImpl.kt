package abstractfactory

class EmployeeServiceWSImpl: IEmployeeService {
    private val employees = listOf("SOA-Maria", "SOA-Rosalia", "SOA-Liliana")
    override fun getEmployees(): List<String> {
        return this.employees
    }
}
package abstractfactory

fun main() {
    val factory: IServiceStackAbstractFactoryy? = ServiceStackAbstractFactory.createServiceFactory()
    val employeeService = factory?.getEmployeeService()
    val productService = factory?.getProductService()
    println("EmployeeService class > " + employeeService?.javaClass?.canonicalName)
    println("ProductService class > " + productService?.javaClass?.canonicalName)
    println("getEmployee > " + employeeService?.getEmployees())
    println("getProduct > " + productService?.getProducts())
}

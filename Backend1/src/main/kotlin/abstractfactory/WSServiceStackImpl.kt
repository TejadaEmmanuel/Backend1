package abstractfactory

class WSServiceStackImpl: IServiceStackAbstractFactoryy {
    override fun getEmployeeService(): IEmployeeService = EmployeeServiceWSImpl()
    override fun getProductService():  IProductService = ProductServiceWSimpi()
}
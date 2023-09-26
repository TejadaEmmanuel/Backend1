package abstractfactory

import properties.PropertiesUtil.loadProperty
import kotlin.reflect.full.createInstance

abstract class ServiceStackAbstractFactory {

        companion object {
            fun createServiceFactory(): IServiceStackAbstractFactoryy? {
                val property = loadProperty(
                    "properties/abstractfactory"
                )
                val factoryClass = property!!.getProperty("serviceProductImplClass")
                return try {
                    Class.forName(factoryClass).kotlin.createInstance() as IServiceStackAbstractFactoryy
                } catch (e: Exception) {
                    e.printStackTrace()
                    null
                }
            }

        }
    }

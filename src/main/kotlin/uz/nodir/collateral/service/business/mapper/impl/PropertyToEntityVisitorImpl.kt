package uz.nodir.collateral.service.business.mapper.impl

import mu.KotlinLogging
import org.springframework.stereotype.Component
import uz.nodir.collateral.model.dto.property.request.param.EquipmentParamDTO
import uz.nodir.collateral.model.dto.property.request.param.RealEstateParamDTO
import uz.nodir.collateral.model.dto.property.request.param.VehicleParamDTO
import uz.nodir.collateral.model.entity.Equipment
import uz.nodir.collateral.model.entity.Property
import uz.nodir.collateral.model.entity.RealEstate
import uz.nodir.collateral.model.entity.Vehicle
import uz.nodir.collateral.service.business.mapper.PropertyToEntityVisitor

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:9:13 AM
 */

@Component
class PropertyToEntityVisitorImpl : PropertyToEntityVisitor<Property> {

    private val log = KotlinLogging.logger {}

    override fun visit(propertyParam: EquipmentParamDTO): Property {
        log.info("taken dto for mapping: $propertyParam")

        val entity = Equipment(
            model = propertyParam.model,
            serial = propertyParam.serial,
        )
        entity.type = propertyParam.type
        entity.description = propertyParam.description
        entity.price = propertyParam.price
        entity.purchaseDate = propertyParam.purchaseDate

        log.info("sent entity after mapping: $entity")
        return entity
    }

    override fun visit(propertyParam: VehicleParamDTO): Property {
        log.info("taken dto for mapping: $propertyParam")

        val entity = Vehicle(
            model = propertyParam.model,
            year = propertyParam.year,
        )
        entity.type = propertyParam.type
        entity.description = propertyParam.description
        entity.price = propertyParam.price
        entity.purchaseDate = propertyParam.purchaseDate

        log.info("sent entity after mapping: $entity")
        return entity
    }

    override fun visit(propertyParam: RealEstateParamDTO): Property {
        log.info("taken dto for mapping: $propertyParam")

        val entity = RealEstate(
            area = propertyParam.area,
            address = propertyParam.address,
        )
        entity.type = propertyParam.type
        entity.description = propertyParam.description
        entity.price = propertyParam.price
        entity.purchaseDate = propertyParam.purchaseDate

        log.info("sent entity after mapping: $entity")
        return entity
    }
}
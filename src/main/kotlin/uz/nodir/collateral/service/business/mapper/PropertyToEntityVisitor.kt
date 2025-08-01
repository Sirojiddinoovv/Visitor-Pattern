package uz.nodir.collateral.service.business.mapper

import org.hibernate.validator.spi.nodenameprovider.Property
import uz.nodir.collateral.model.dto.property.request.param.EquipmentParamDTO
import uz.nodir.collateral.model.dto.property.request.param.RealEstateParamDTO
import uz.nodir.collateral.model.dto.property.request.param.VehicleParamDTO
import uz.nodir.collateral.model.entity.Equipment
import uz.nodir.collateral.model.entity.RealEstate
import uz.nodir.collateral.model.entity.Vehicle

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:56 AM
 */

interface PropertyToEntityVisitor<T> {

    fun visit(propertyParam: EquipmentParamDTO): T

    fun visit(propertyParam: VehicleParamDTO): T

    fun visit(propertyParam: RealEstateParamDTO): T
}
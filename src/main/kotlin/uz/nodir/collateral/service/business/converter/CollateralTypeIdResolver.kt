package uz.nodir.collateral.service.business.converter

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase
import uz.nodir.collateral.exceptions.IncorrectDataException
import uz.nodir.collateral.model.dto.property.response.RealEstateResultDTO
import uz.nodir.collateral.model.dto.property.response.VehicleResultDTO
import uz.nodir.collateral.model.enums.CollateralType

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:9:10 AM
 */

class CollateralTypeIdResolver : TypeIdResolverBase() {

    override fun idFromValue(value: Any?): String {
        return CollateralType
            .entries
            .firstOrNull {
                it.propertyClass.isInstance(value)
            }?.name
            ?: throw IncorrectDataException("$value not found for resolving")
    }

    override fun idFromValueAndType(value: Any?, suggestedType: Class<*>?): String {
        return idFromValue(value)
    }

    override fun getMechanism(): JsonTypeInfo.Id {
        return JsonTypeInfo.Id.CUSTOM
    }
}
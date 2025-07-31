package uz.nodir.collateral.model.enums

import uz.nodir.collateral.model.dto.property.response.EquipmentResultDTO
import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO
import uz.nodir.collateral.model.dto.property.response.VehicleResultDTO
import kotlin.reflect.KClass

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:45 AM
 */
enum class CollateralType(
    val propertyClass: KClass<out PropertyResponseDTO>,
) {
    REAL_ESTATE(EquipmentResultDTO::class),
    VEHICLE(VehicleResultDTO::class),
    EQUIPMENT(EquipmentResultDTO::class),
}
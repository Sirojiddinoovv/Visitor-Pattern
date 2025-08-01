package uz.nodir.collateral.model.enums

import uz.nodir.collateral.model.dto.property.request.PropertyRequestDTO
import uz.nodir.collateral.model.dto.property.request.param.EquipmentParamDTO
import uz.nodir.collateral.model.dto.property.request.param.RealEstateParamDTO
import uz.nodir.collateral.model.dto.property.request.param.VehicleParamDTO
import uz.nodir.collateral.model.dto.property.response.result.EquipmentResultDTO
import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO
import uz.nodir.collateral.model.dto.property.response.result.RealEstateResultDTO
import uz.nodir.collateral.model.dto.property.response.result.VehicleResultDTO
import kotlin.reflect.KClass

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:45 AM
 */
enum class CollateralType(
    val resultClass: KClass<out PropertyResponseDTO>,
    val paramClass: KClass<out PropertyRequestDTO>,
) {
    REAL_ESTATE(RealEstateResultDTO::class, RealEstateParamDTO::class),
    VEHICLE(VehicleResultDTO::class, VehicleParamDTO::class),
    EQUIPMENT(EquipmentResultDTO::class, EquipmentParamDTO::class),
}
package uz.nodir.collateral.service.business.mapper.impl

import mu.KotlinLogging
import org.springframework.stereotype.Component
import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO
import uz.nodir.collateral.model.dto.property.response.result.EquipmentResultDTO
import uz.nodir.collateral.model.dto.property.response.result.RealEstateResultDTO
import uz.nodir.collateral.model.dto.property.response.result.VehicleResultDTO
import uz.nodir.collateral.model.entity.Equipment
import uz.nodir.collateral.model.entity.RealEstate
import uz.nodir.collateral.model.entity.Vehicle
import uz.nodir.collateral.service.business.mapper.PropertyToDtoVisitor

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:9:02 AM
 */

@Component
class PropertyToDtoVisitorImpl : PropertyToDtoVisitor<PropertyResponseDTO> {

    private val log = KotlinLogging.logger {}

    override fun visit(property: Equipment): PropertyResponseDTO {
        log.info("taken entity for mapping: $property")

        val responseDTO = EquipmentResultDTO(
            id = property.id,
            type = property.type,
            description = property.description,
            price = property.price,
            purchaseDate = property.purchaseDate,
            serial = property.serial,
            model = property.model,
            )

        log.info("sent dto after mapping: $responseDTO")
        return responseDTO
    }

    override fun visit(property: Vehicle): PropertyResponseDTO {
        log.info("taken entity for mapping: $property")

        val responseDTO = VehicleResultDTO(
            id = property.id,
            type = property.type,
            description = property.description,
            price = property.price,
            purchaseDate = property.purchaseDate,
            model = property.model,
            year = property.year,
        )

        log.info("sent dto after mapping: $responseDTO")
        return responseDTO
    }

    override fun visit(property: RealEstate): PropertyResponseDTO {
        log.info("taken entity for mapping: $property")

        val responseDTO = RealEstateResultDTO(
            id = property.id,
            type = property.type,
            description = property.description,
            price = property.price,
            purchaseDate = property.purchaseDate,
            area = property.area,
            address = property.address,
        )

        log.info("sent dto after mapping: $responseDTO")
        return responseDTO
    }
}
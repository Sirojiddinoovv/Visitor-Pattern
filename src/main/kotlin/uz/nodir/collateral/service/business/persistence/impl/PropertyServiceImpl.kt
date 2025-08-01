package uz.nodir.collateral.service.business.persistence.impl

import mu.KotlinLogging
import org.springframework.stereotype.Service
import uz.nodir.collateral.model.dto.core.response.ResultData
import uz.nodir.collateral.model.dto.property.request.PropertyRequestDTO
import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO
import uz.nodir.collateral.model.entity.Property
import uz.nodir.collateral.service.business.mapper.PropertyToDtoVisitor
import uz.nodir.collateral.service.business.mapper.PropertyToEntityVisitor
import uz.nodir.collateral.service.business.persistence.PropertyService
import uz.nodir.collateral.service.core.persistence.PropertyDAO

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:9:08 AM
 */

@Service
class PropertyServiceImpl(
    private val dao: PropertyDAO,
    private val propertyToEntityVisitor: PropertyToEntityVisitor<Property>,
    private val propertyToDtoVisitor: PropertyToDtoVisitor<PropertyResponseDTO>
) : PropertyService {

    private val log = KotlinLogging.logger {}


    override fun create(requestDTO: PropertyRequestDTO): ResultData<PropertyResponseDTO> {
        log.info("Received command to create new property with request dto $requestDTO")

        val preparedProperty = requestDTO.accept(propertyToEntityVisitor)

        val property = dao.save(preparedProperty)

        val convertedDTO = property.accept(propertyToDtoVisitor)

        val response = ResultData.ok(convertedDTO)

        log.info("Finished command to create new property with response dto $response")

        return response
    }

    override fun findAll(): ResultData<List<PropertyResponseDTO>> {
        log.info("Received command to find all properties")

        val properties = dao.findAll()

        val convertedDTO = properties
            .map { property -> property.accept(propertyToDtoVisitor) }

        val response = ResultData.ok(convertedDTO)

        log.info("Finished command to find all properties with size: ${convertedDTO.size}")
        return response
    }
}
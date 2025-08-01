package uz.nodir.collateral.service.business.persistence.impl

import mu.KotlinLogging
import org.springframework.stereotype.Service
import uz.nodir.collateral.model.dto.core.response.ResultData
import uz.nodir.collateral.model.dto.property.request.PropertyRequestDTO
import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO
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
    private val dao: PropertyDAO
): PropertyService {

    private val log = KotlinLogging.logger {}


    override fun save(requestDTO: PropertyRequestDTO): ResultData<PropertyResponseDTO> {
        log.info("Received command to create new property with request dto $requestDTO")

        TODO("Not yet implemented")
    }

    override fun findAll(): ResultData<List<PropertyResponseDTO>> {
        TODO("Not yet implemented")
    }
}
package uz.nodir.collateral.service.business.persistence

import uz.nodir.collateral.model.dto.core.response.ResultData
import uz.nodir.collateral.model.dto.property.request.PropertyRequestDTO
import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:31 AM
 */
interface PropertyService  {

    fun save(requestDTO: PropertyRequestDTO): ResultData<PropertyResponseDTO>

    fun findAll(): ResultData<List<PropertyResponseDTO>>
}
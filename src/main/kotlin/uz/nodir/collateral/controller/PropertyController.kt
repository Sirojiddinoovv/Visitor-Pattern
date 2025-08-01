package uz.nodir.collateral.controller

import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uz.nodir.collateral.model.dto.property.request.PropertyRequestDTO
import uz.nodir.collateral.service.business.persistence.PropertyService

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:4:16 PM
 */

@RestController
@RequestMapping("/api/property")
class PropertyController(
    private val service: PropertyService
) {

    @PostMapping
    fun create(@RequestBody @Valid requestDTO: PropertyRequestDTO) =
        ResponseEntity.ok(
            service.create(requestDTO)
        )

    @GetMapping
    fun findAll() =
        ResponseEntity.ok(service.findAll())
}
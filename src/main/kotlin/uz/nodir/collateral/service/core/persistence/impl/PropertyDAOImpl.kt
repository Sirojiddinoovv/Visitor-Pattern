package uz.nodir.collateral.service.core.persistence.impl

import mu.KotlinLogging
import org.springframework.stereotype.Service
import uz.nodir.collateral.model.entity.Property
import uz.nodir.collateral.repository.PropertyRepository
import uz.nodir.collateral.service.core.persistence.PropertyDAO

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:25 AM
 */

@Service
class PropertyDAOImpl(
    private val repository: PropertyRepository
) : PropertyDAO {

    private val log = KotlinLogging.logger {}

    override fun save(property: Property): Property {
        log.info("Save/update property entity: $property")
        val result = repository.save(property)

        log.info("Saved entity id: ${result.id}")
        return result
    }

    override fun findAll(): List<Property> {
        log.info("Find all property list")
        val result = repository.findAll()

        log.info("Found ${result.size} properties")
        return result
    }

    override fun findById(id: Long): Property? {
        log.info("Find property by id: $id")
        val result = repository.findById(id)

        log.info("Found property: $result")
        return result.orElse(null)
    }

    override fun deleteById(id: Long) {
        log.info("Delete property by id: $id")
        repository.deleteById(id)
    }
}
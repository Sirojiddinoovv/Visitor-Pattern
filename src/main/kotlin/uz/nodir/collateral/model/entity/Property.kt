package uz.nodir.collateral.model.entity

import jakarta.persistence.*
import uz.nodir.collateral.model.enums.CollateralType
import uz.nodir.collateral.service.business.mapper.PropertyVisitor
import java.io.Serializable
import java.time.LocalDate

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:35 AM
 */

@Entity
@Table(
    name = "property",
    indexes = [
        Index(name = "property_created_date_idx", columnList = "createdDate")
    ]
)
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Property(

    @SequenceGenerator(
        name = "property_seq",
        sequenceName = "property_seq"
    )
    @GeneratedValue(
        generator = "property_seq",
        strategy = GenerationType.SEQUENCE
    )
    @Id
    var id: Long? = null,

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    var type: CollateralType? = null,

    @Column(name = "description")
    var description: String? = null,

    @Column(name = "price")
    var price: Long? = null,

    @Column(name = "purchase_date")
    var purchaseDate: LocalDate? = null,

    ) : Serializable, BaseEntity() {

    abstract fun <T> accept(visitor: PropertyVisitor<out T>)
}
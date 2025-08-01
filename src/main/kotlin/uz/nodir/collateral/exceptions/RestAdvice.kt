package uz.nodir.collateral.exceptions

import mu.KotlinLogging
import org.springframework.context.annotation.Configuration
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import uz.nodir.collateral.model.dto.core.response.CoreError
import uz.nodir.collateral.model.dto.core.response.ResultData

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:3:52 PM
 */

@RestControllerAdvice
class RestAdvice {

    private val log = KotlinLogging.logger {}

    @ExceptionHandler(value = [MethodArgumentNotValidException::class])
    fun methodArgumentNotValidException(e: MethodArgumentNotValidException): ResponseEntity<ResultData<CoreError>> {
        log.error("MethodArgumentNotValidException message: {}", e.message)
        return ResponseEntity.ok(
            ResultData.error(
                400, "Fields wrong filled!"
            )
        )
    }

    @ExceptionHandler(value = [HttpMessageNotReadableException::class])
    fun httpMessageNotReadableException(e: HttpMessageNotReadableException): ResponseEntity<ResultData<CoreError>> {
        log.error("HttpMessageNotReadableException message: {}", e.message)
        return ResponseEntity.ok(
            ResultData.error(
                400, "Fields wrong filled!"
            )
        )
    }

    @ExceptionHandler(value = [IncorrectDataException::class])
    fun incorrectDataException(e: IncorrectDataException): ResponseEntity<ResultData<CoreError>> {
        log.error("IncorrectDataException message: {}", e.message)
        return ResponseEntity.ok(
            ResultData.error(
                400, e.message ?: "IncorrectDataException message"
            )
        )
    }

}
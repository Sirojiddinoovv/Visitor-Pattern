package uz.nodir.collateral.model.dto.core.response

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:37 AM
 */

data class ResultData<out T>(
    val isSuccess: Boolean = false,
    val data: T? = null,
    val error: CoreError? = null,
) {

    companion object {

        fun <T> success(data: T): ResultData<T> {
            return ResultData(
                isSuccess = true,
                data = data
            )
        }

        fun <T> error(code: Int, message: String): ResultData<T> {
            return ResultData(
                isSuccess = false,
                data = null,
                error = CoreError(code, message)
            )
        }
    }
}
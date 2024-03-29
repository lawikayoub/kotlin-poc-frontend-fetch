package nl.lawik.poc.frontend.fetch

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class Todo(
    val userId: Long,
    val title: String,
    val completed: Boolean,
    @Optional val id: Long? = null
)
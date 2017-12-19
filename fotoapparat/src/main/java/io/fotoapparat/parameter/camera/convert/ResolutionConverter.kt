package io.fotoapparat.parameter.camera.convert

import android.hardware.Camera
import io.fotoapparat.parameter.Resolution

/**
 * Converts [Camera.Size] to [Resolution].
 */
fun Camera.Size.toResolution(): Resolution {
    return Resolution(
            width,
            height
    )
}
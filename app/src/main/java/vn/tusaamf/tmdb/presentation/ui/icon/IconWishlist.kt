package vn.tusaamf.tmdb.presentation.ui.icon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path

public val Icons.Filled.Wishlist: ImageVector
    get() {
        if (_wishlist != null) {
            return _wishlist!!
        }
        _wishlist = materialIcon(name = "Filled.Wishlist") {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(400.0f, 480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -10.63f,
                    dy1 = -4.0f
                )
                lineTo(256.0f, 357.41f)
                lineTo(122.63f, 476.0f)
                arcToRelative(16.0f, 16.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -26.63f,
                    dy1 = -12.0f
                )
                lineTo(96.0f, 96.0f)
                arcToRelative(64.07f, 64.07f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 64.0f,
                    dy1 = -64.0f
                )
                horizontalLineToRelative(192.0f)
                arcToRelative(64.07f, 64.07f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 64.0f,
                    dy1 = 64.0f
                )
                verticalLineToRelative(368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 16.0f
                )
                close()
            }
        }
        return _wishlist!!
    }

private var _wishlist: ImageVector? = null
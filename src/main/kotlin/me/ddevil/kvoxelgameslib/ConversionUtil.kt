package me.ddevil.kvoxelgameslib

import me.minidigger.voxelgameslib.map.Vector3D
import org.bukkit.util.Vector

fun Vector3D.toBukkit() = Vector(x, y, z)

fun Vector.toVoxel() = Vector3D(x, y, z)
/*
 * MIT License
 *
 * Copyright (c) 2020 - 2022 vini2003
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.vini2003.hammer.core.registry.common

object HCConfig {
	@JvmField
	var ENABLE_ATTACK_DAMAGE_MULTIPLIER: Boolean = true
	@JvmField
	var ENABLE_DAMAGE_MULTIPLIER: Boolean = true
	@JvmField
	var ENABLE_FALL_DAMAGE_MULTIPLIER: Boolean = true
	@JvmField
	var ENABLE_MOVEMENT_SPEED_MULTIPLIER: Boolean = true
	@JvmField
	var ENABLE_JUMP_MULTIPLIER: Boolean = true
	@JvmField
	var ENABLE_HEAL_MULTIPLIER: Boolean = true
	@JvmField
	var ENABLE_EXHAUSTION_MULTIPLIER: Boolean = true
	
	@JvmField
	var ENABLE_END_PORTAL: Boolean = true
	@JvmField
	var ENABLE_NETHER_PORTAL: Boolean = true
	
	@JvmStatic
	@Suppress("INAPPLICABLE_JVM_NAME")
	@get:JvmName("shouldUseDroplets")
	@set:JvmName("setUseDroplets")
	var USE_DROPLETS: Boolean = true
		get() = field
		set(value) {
			if (value) {
				USE_BUCKETS = false
			}
			
			field = value
		}
	
	@JvmStatic
	@Suppress("INAPPLICABLE_JVM_NAME")
	@get:JvmName("shouldUseBuckets")
	@set:JvmName("setUseBuckets")
	var USE_BUCKETS: Boolean = false
		get() = field
		set(value) {
			if (value) {
				USE_DROPLETS = false
			}
			
			field = value
		}
}
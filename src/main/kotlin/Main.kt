import kotlin.Double.Companion.MAX_VALUE
import kotlin.Double.Companion.MIN_VALUE
import kotlin.math.floor
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.random.Random.Default.nextDouble
import kotlin.random.Random.Default.nextInt

fun main() {
	println(
		if (PerfectSquares { floor(sqrt(it.toDouble())) == sqrt(it.toDouble()) }.isPerfectSquare(
				nextInt(
					2, Int.MAX_VALUE
				)
			)
		) "Yes" else "No"
	)
	Quotients { `this`: Double, that: Double ->
		println(String.format("%f", ((1000 * `this`) / that).roundToInt() / 1000f).substring(0..4))
	}.quotient(nextDouble(MIN_VALUE, MAX_VALUE), nextDouble(MIN_VALUE, MAX_VALUE))
}

fun price(p: Double, pD: Double, fD: Double) = p * (1 - pD) - fD

fun <P, PD, FD, R> ((P, PD, FD) -> R).partial1(p: P): (PD, FD) -> R =
    { pd, fd -> this.invoke(p, pd, fd) }

val price100 = ::price.partial1(100.0)
val finalPrice100 = price100.invoke(0.2, 10.0)

println("$finalPrice100")
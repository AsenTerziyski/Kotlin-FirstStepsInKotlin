//import arrow.core.Either
//import arrow.core.left
//import java.math.BigDecimal
//
//fun main(args: Array<String>) {
//    val acount = Account.create(BigDecimal.valueOf(100))
//    when (acount) {
//        is Either.Right -> acount.value.deposit(BigDecimal.valueOf(100))
//        is Either.Left -> TODO()
//    }
//
//
//}
//
//sealed class Either<out A, out B> {
//    class Left<A>(val value: A) : Either<A, Nothing>()
//    class Right<B>(val value: B) : Either<Nothing, B>()
//
//    fun <C> map(fn: (B) -> C): Either<A, C> = when (this) {
//        is Right -> Right(fn(this.value))
//        is Left -> this
//    }
//}
//
//data class Account private constructor(val balance: BigDecimal) {
//
//    companion object {
//        fun create(initialBalance: BigDecimal): Either<NegativeAmount, Account> =
//            if (initialBalance < BigDecimal.ZERO) Either.Left(NegativeAmount)
//            else Either.Right(Account(initialBalance))
//    }
//
//    fun deposit(amount: BigDecimal): Account = this.copy(balance = this.balance + amount)
//}
//
//object NegativeAmount
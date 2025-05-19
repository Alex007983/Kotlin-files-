import kotlin.collections.mutableListOf

fun main() {
    val account = BankAccount("Deepsundar Das")
    account.deposite(2000.0f)
    account.withdraw(1000.0f)
    account.showTransaction()
}

class BankAccount(val accountName: String) {
    private var balance: Float = 0.0f
    private val transaction = mutableListOf<String>()

    fun withdraw(withdrawAmount: Float) {
        if (balance < withdrawAmount) {
            print("Insufficient Balance \n Transaction failed")
            return
        }

        balance -= withdrawAmount
        var t = "Withdraw Amount --> $withdrawAmount --------- Balance --> $balance"
        transaction.add(t)
        println("$withdrawAmount is debited")
        checkBalance()
    }

    fun deposite(depositeAmount: Float) {
        balance += depositeAmount
        var t = "Deposite Amount --> $depositeAmount --------- Balance --> $balance"
        transaction.add(t)
        println("$depositeAmount is credited")
        checkBalance()
    }

    fun checkBalance() {
        println("Your current balance is : $balance")
    }

    fun showTransaction() {
        for (i in transaction) {
            println(i)
        }
    }
}

package state


fun main() {
    val machine = VendingMachine(2)

    machine.insertCoin()
    machine.dispenseIten()

    machine.insertCoin()
    machine.dispenseIten()

    machine.insertCoin()
    machine.dispenseIten()
}

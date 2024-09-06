package state

class OutOfStockState : VendingMachineState {
    override fun insertCoin(machine: VendingMachine) {
        println("Out of stock. You can't insert a coin")
    }

    override fun dispenseItem(machine: VendingMachine) {
        println("Out of stock. No items to dispense")
    }
}

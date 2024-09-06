package state

class HasCoinState : VendingMachineState {
    override fun insertCoin(machine: VendingMachine) {
        println("Coin already inserted. Dispense the item first")
    }

    override fun dispenseItem(machine: VendingMachine) {
        if (machine.items > 0) {
            println("Item dispensed.")
            machine.items--
            if (machine.items == 0) {
                machine.setState(OutOfStockState())
            } else {
                machine.setState(ReadyState())
            }
        }

    }

}

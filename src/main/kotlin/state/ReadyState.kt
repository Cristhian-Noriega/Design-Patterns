package state

class ReadyState : VendingMachineState {
    override fun insertCoin(machine: VendingMachine) {
        println("Coin inserted. You can now dispense an item")
        machine.setState(HasCoinState())
    }

    override fun dispenseItem(machine: VendingMachine) {
        println("Insert a coin first")
    }

}

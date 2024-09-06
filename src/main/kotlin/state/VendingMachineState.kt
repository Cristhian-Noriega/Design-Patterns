package state

interface VendingMachineState {
    fun insertCoin(machine: VendingMachine)
    fun dispenseItem(machine: VendingMachine)
}

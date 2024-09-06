package state

class VendingMachine(var items: Int) {
    private var state: VendingMachineState = if (items > 0) ReadyState() else OutOfStockState()

    fun setState(newState: VendingMachineState) {
        state = newState
    }

    fun insertCoin() {
        state.insertCoin(this)
    }

    fun dispenseIten() {
        state.dispenseItem(this)
    }
}

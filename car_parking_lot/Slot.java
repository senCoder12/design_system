public class Slot {
    private SlotType slotType;
    private boolean isEmpty = true;

    public Slot(SlotType slotType) {
        this.slotType = slotType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void bookSlot() {
        this.isEmpty = false;
    }

    public void freeSlot() {
        isEmpty = true;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(SlotType slotType) {
        this.slotType = slotType;
    }
}

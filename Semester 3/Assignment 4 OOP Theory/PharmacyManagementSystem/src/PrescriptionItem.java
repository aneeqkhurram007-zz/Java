public class PrescriptionItem extends Item {
    private int potency;
    private int dose;
    private boolean currentStatus;

    public PrescriptionItem(int id, String name, int potency, int dose) {
        super(id, name);
        setPotency(potency);
        setDose(dose);
    }

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public boolean isCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(boolean currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public void changeState(boolean state) {
        setCurrentStatus(state);
    }

    @Override
    public void reset() {
        setCurrentStatus(false);
    }

    @Override
    public String toString() {
        return "\nPrescription Item\n" + super.toString();
    }
}

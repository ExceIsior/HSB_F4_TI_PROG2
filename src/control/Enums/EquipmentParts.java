package control.Enums;

public enum EquipmentParts {
    WEAPON("Weapon"),
    ARMOR("Armor"),
    ACCESSORY("Accessory");

    private String partTitle;

    private EquipmentParts(String partTitle) {
        this.partTitle = partTitle;
    }

    public String getpartTitle() {
        return this.partTitle;
    }
}

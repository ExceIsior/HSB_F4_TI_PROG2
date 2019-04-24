package model.item.Equipment;

public class EquipmentSet {

    private Weapon weapon = null;
    private Armor armor = null;
    private Accessory accessory = null;

    public EquipmentSet(Weapon weapon, Armor armor, Accessory accessory) {
        this.weapon = weapon;
        this.armor = armor;
        this.accessory = accessory;
    }

    public void setEquipment(Equipment equipment) {
        this.setEquipment(equipment);
    }

    public void setEquipment(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setEquipment(Armor armor) {
        this.armor = armor;
    }

    public void setEquipment(Accessory accessory) {
        this.accessory = accessory;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public Equipment[] getEquipmentSet() {
        return new Equipment[]{this.weapon, this.armor, this.accessory};
    }

}

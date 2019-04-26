package model.item.Equipment;

/**
 * Heroes' equipment set. A set consist of a weapon, an armor
 * and an accessory.
 *
 * @author Ismail
 */
public class EquipmentSet {

    private Weapon weapon = null;
    private Armor armor = null;
    private Accessory accessory = null;

    /**
     * Initialises an equipment set.
     *
     * @param weapon Weapon of the set
     * @param armor Armor of the set
     * @param accessory Accessory of the set.
     */
    public EquipmentSet(Weapon weapon, Armor armor, Accessory accessory) {
        this.weapon = weapon;
        this.armor = armor;
        this.accessory = accessory;
    }

    /**
     * Equips a weapon to the set.
     *
     * @param weapon Weapon to be equipped
     */
    public void setEquipment(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Equips an armor to the set.
     *
     * @param weapon Weapon to be equipped
     */
    public void setEquipment(Armor armor) {
        this.armor = armor;
    }

    /**
     * Equips an accessory to the set.
     *
     * @param weapon Accessory to be equipped
     */
    public void setEquipment(Accessory accessory) {
        this.accessory = accessory;
    }

    /**
     * Returns current equipped weapon.
     *
     * @return Current equipped weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Returns current equipped armor.
     *
     * @return Current equipped armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * Returns current equipped accessory.
     *
     * @return Current equipped accessory
     */
    public Accessory getAccessory() {
        return accessory;
    }

    /**
     * Returns the whole equipment set.
     *
     * @return Array of equipment parts. [0]->Weapon;[1]->Armor;[2]->Accessory
     */
    public Equipment[] getEquipmentSet() {
        return new Equipment[]{this.weapon, this.armor, this.accessory};
    }

}

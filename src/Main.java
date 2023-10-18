public class Main {
    public static void main(String[] args) {
        Weapon weapon= new Weapon();
        weapon.setWeaponType(WeaponType.COLD);
        weapon.setNameOfGun("ножь");
       Boss boss = new Boss();
    boss.setDamage(150);
    boss.setHealth(490);
    boss.setWeapon(weapon);

        System.out.println(boss.getHealth()+ " " +
                boss.getDamage()+" " +
                weapon.getWeaponType()+ " "+
                weapon.getNameOfGun());
    }
}
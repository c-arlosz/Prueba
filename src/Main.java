//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String marca1;
        String marca2;
        Laptop funny = new Laptop();
        Laptop hp = new Laptop();
        Laptop betterWare = null;
        Laptop notHP = hp;
        hp.setMarca("hp");
        System.out.println("marca de la laop hp" + hp.getMarca());
        System.out.println("marca de la lap nothp" + notHP.getMarca());
        //betterWare.getMarca();
        if ( betterWare != null){
            betterWare.getMarca();
        }

        marca1 = funny.getMarca();
        marca2 = hp.getMarca();
        if(marca1.equals(marca2)) {
            System.out.println("las dos marcas son iguales ");
        } else {
                System.out.println("las dos marcas no son iguales");
        }

    }
}

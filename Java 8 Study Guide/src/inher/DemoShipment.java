package inher;
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);
        Shipment clon = new Shipment(shipment1);
        double vol;
        vol = shipment1.volume();
        System.out.println("Объем shipmentl равен " + vol);
        System.out.println("Bec shipmentl равен "
                + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен "
                + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        vol = clon.volume();
        System.out.println(vol);
        System.out.println(clon.weight);
        System.out.println(clon.cost);
    }
}

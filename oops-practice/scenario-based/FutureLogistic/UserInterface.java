package FutureLogistic;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();
        System.out.println("Enter the Goods Transport details");

        System.out.println("For BrickTransport:");
        System.out.println("transportId:transportDate:transportRating:BrickTransport:brickSize:brickQuantity:brickPrice");
        System.out.println("For TimberTransport:");
        System.out.println("transportId:transportDate:transportRating:TimberTransport:timberLength:timberRadius:timberType:timberPrice");
        String input = sc.nextLine();
        String transportId = input.split(":")[0];
        if (!utility.validateTransportId(transportId)) {
            return;
        }
        GoodsTransport goodsTransport = utility.parseDetails(input);
        String type = utility.findObjectType(goodsTransport);

        System.out.println("\nTransporter id : " + goodsTransport.getTransportId());
        System.out.println("Date of transport : " + goodsTransport.getTransportDate());
        System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) goodsTransport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
            System.out.println("Vehicle for transport : " + bt.vehicleSelection());
            System.out.println("Total charge : " + bt.calculateTotalCharge());
        } else {
            TimberTransport tt = (TimberTransport) goodsTransport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
            System.out.println("Vehicle for transport : " + tt.vehicleSelection());
            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }
    }
}

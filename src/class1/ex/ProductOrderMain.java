package class1.ex;
import java.io.*;
import java.util.*;

public class ProductOrderMain {
    public static void main(String[] args) throws IOException {
        ProductOrder[] orders = new ProductOrder[3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < orders.length; i++) {
            orders[i] = new ProductOrder();
            System.out.println("상품명을 입력하세요 >> ");
            orders[i].productName = br.readLine();
            System.out.println("가격을 입력하세요 >> ");
            orders[i].price = Integer.parseInt(br.readLine());
            System.out.println("수량을 입력하세요 >> ");
            orders[i].quantity = Integer.parseInt(br.readLine());
        }

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + " 수량 : " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}


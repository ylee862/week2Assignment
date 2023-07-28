import customers.*;
import delivery.DeliveryManager;
import staff.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderSneakersSituationV2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final long TODAY_START_SALES_AMOUNT = 0;

        Staff staff = new Staff(TODAY_START_SALES_AMOUNT);
        DeliveryManager deliveryManager = new DeliveryManager(TODAY_START_SALES_AMOUNT);

        List<Customers> customers = new ArrayList<>();


        staff.readFileAndSetSneakerInfoMap();
        staff.readFileAndSetSneakersStockMap();

        deliveryManager.readFileAboutDeliveryInfo();


        // 고객 대기 등록을 받습니다.
        System.out.println("안녕하세요~, \"고객등급,이름,배송선호 여부,예산,운동화 모델명\" 입력해주세요");

        while (scanner.hasNext()) {
            String response = scanner.nextLine();

            if (response.equals("끝")) {
                break;
            }

            try {
                String[] responseArray = response.split(",");
                CustomerLevel customerLevel = CustomerLevel.valueOf(responseArray[0]);
                String customerName = responseArray[1];
                boolean isCustomerLikeDelivery = Boolean.parseBoolean(responseArray[2]);
                Long cache = Long.parseLong(responseArray[3]);
                String sneakersModelName = responseArray[4];

                Customers customer = null;

                switch (customerLevel) {
                    case VIP:
                        customer = new VIPCustomer();
                        break;
                    case GOLD:
                        customer = new GoldCustomer();
                        break;
                    case SILVER:
                        customer = new SilverCustomer();
                        break;
                }




            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("입력 형식이 잘못 되어 고객 등록 넘어갑니다.");
            }
        }
        /**
         * 이후 작업 이어서 진행 해주세요.
         */

    }
}
package delivery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DeliveryManager {
    private Map<String, DeliveryInfo> deliveryInfoMap;
    private long salesAmount;

    public DeliveryManager(long salesAmount) {
        this.salesAmount = salesAmount;
        this.deliveryInfoMap = new HashMap<>();
    }

    public void readFileAboutDeliveryInfo(){
        try(BufferedReader fis = new BufferedReader(new FileReader("/Users/yedamlee/Downloads/supercoding/assignments/week2Assignment/SatProject/src/textFiles/nike-sneaker-delivery-infos.txt"))){

            String line;
            while(true){
                line = fis.readLine();
                if(line == null) break;

                String[] strArray = line.split("\\|");
                String modelName = strArray[0];
                String hour = strArray[1];
                long price = Long.parseLong(strArray[2]);

                DeliveryInfo deliveryInfo = new DeliveryInfo(modelName, hour, price);
                deliveryInfoMap.put(modelName, deliveryInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("배송 담당자: 운동화 정보 다음과 같이 숙지하였습니다. " + this.deliveryInfoMap);
    }
}

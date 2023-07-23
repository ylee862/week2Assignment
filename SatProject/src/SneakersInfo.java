import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SneakersInfo {
    private String modelName;
    private long price;
    private List<ShoeFeatures> features;

    public SneakersInfo(String modelName, long price, String[] features) {
        this.modelName = modelName;
        this.price = price;
        this.features = Stream.of(features)
                .map((feature) -> ShoeFeatures.valueOfTerm(feature))
                .collect(Collectors.toList());
    }

    public List<ShoeFeatures> getFeatures() {
        return features;
    }

    public long getPrice() {
        return price;
    }

}

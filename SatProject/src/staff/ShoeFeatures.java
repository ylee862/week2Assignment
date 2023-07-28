package staff;

public enum ShoeFeatures {
    STABILITY("안정성", "Stability"),
    COMFORT("편안함", "Comfort"),
    CLASSIC("클래식함", "Classic"),
    TRENDINESS("트렌디함", "Trendiness"),
    DURABILITY("내구성", "Durability"),
    PERFORMANCE("운동성", "Performance"),

    UNKNOWN("모름", "unknown");

    private String shoeFeatureKorean;
    private String shoeFeatureEnglish;
    ShoeFeatures(String shoeFeatureKorean, String shoeFeatureEnglish) {
        this.shoeFeatureKorean = shoeFeatureKorean;
        this.shoeFeatureEnglish = shoeFeatureEnglish;
    }

    public static ShoeFeatures valueOfTerm(String str){
        for(ShoeFeatures feature: values()){
            if(str.equals(feature.shoeFeatureKorean) || str.equals(feature.shoeFeatureEnglish)){
                return feature;
            }
        }
        return UNKNOWN;
    }

    public String toString() {
        return shoeFeatureKorean;
    }
}

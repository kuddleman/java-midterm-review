public enum FeedbackCategory {
    POSITIVE(7, 10, "Positive"), NEUTRAL(4, 6, "Neutral"), NEGATIVE(0,3, "Negative");

    private int min, max;
    private String description;

    private FeedbackCategory(int min, int max, String description) {
        this.min = min;
        this.max = max;
        this.description = description;
    }
    public static FeedbackCategory getCategory(int score) {
        FeedbackCategory[] categoryArray = FeedbackCategory.values();
        for(FeedbackCategory category : categoryArray) {
            if(category.min <= score && score <= category.max) {
                return category;
            }
        }
        throw new IllegalArgumentException("Invalid score");
    }
    // this will make the description in small letters appear.
    public String toString() {
        return description;
    }
}

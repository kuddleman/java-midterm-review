public enum FeedbackCategory {
    POSITIVE(7, 10), NEUTRAL(4, 6), NEGATIVE(0,3);

    private int min, max;

    private FeedbackCategory(int min, int max) {
        this.min = min;
        this.max = max;
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
}

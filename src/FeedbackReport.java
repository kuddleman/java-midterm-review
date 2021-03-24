public class FeedbackReport {
    private int score;
    private FeedbackCategory category;
    private String feedbackText;
    private int id;

    private static int numberOfFeedbackReports = 0;

    public FeedbackReport( int score, String feedbackText) {
        this.score = score;
        this.feedbackText = feedbackText;
        this.category = FeedbackCategory.getCategory(score);

        // generate unique id
        FeedbackReport.numberOfFeedbackReports ++;
        this.id = FeedbackReport.numberOfFeedbackReports;
    }

    public int getScore() {
        return score;
    }

    public String getFeedbackText() {
        return feedbackText;
    }
}

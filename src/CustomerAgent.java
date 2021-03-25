import java.util.ArrayList;

public class CustomerAgent {

    private String name;
    private ArrayList<FeedbackReport> feedbackReportList;

    private static final int NUMBER_REPORTS_NEEDED_FOR_BONUS = 100;
    private static final double PERCENTAGE_OF_POSITIVE_REPORTS_NEEDED_FOR_BONUS = 0.75;

    public CustomerAgent(String name) {
        this.name = name;
        feedbackReportList = new ArrayList<FeedbackReport>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<FeedbackReport> getFeedbackReportList() {
        return new ArrayList<FeedbackReport>(feedbackReportList);
    }

    // omitting setters

    public String toString() {
        String s = name + "\n";
        for(FeedbackReport report : feedbackReportList) {
            s += "\t" + report + "\n";
        }
        return s;
    }

    public boolean addFeedbackReport(FeedbackReport report) {
        return feedbackReportList.add(report);
    }

    public boolean isEligibleForBonus() {
        if(feedbackReportList.size() < NUMBER_REPORTS_NEEDED_FOR_BONUS) {
            return false;
        } else {
            int totalGood = 0;
            for(FeedbackReport report : feedbackReportList) {
                if(report.isGood()) {
                    totalGood ++;
                }
            }
            double percentGood = (totalGood * 1.0) / feedbackReportList.size();
            return percentGood >= PERCENTAGE_OF_POSITIVE_REPORTS_NEEDED_FOR_BONUS;
        }

    }
}

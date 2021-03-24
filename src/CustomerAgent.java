import java.util.ArrayList;

public class CustomerAgent {

    private String name;
    private ArrayList<FeedbackReport> feedbackReportList;

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
        return name + "\n" + feedbackReportList;
    }

    public boolean addFeedbackReport(FeedbackReport report) {
        return feedbackReportList.add(report);
    }
}

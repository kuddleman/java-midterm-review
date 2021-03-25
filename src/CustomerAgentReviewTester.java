public class CustomerAgentReviewTester {
    public static void main(String[] args) {
        FeedbackReport report1 = new FeedbackReport(1, "terrible!");
        FeedbackReport report2 = new FeedbackReport(1, "okay");
        FeedbackReport report3 = new FeedbackReport(1, "this agent was awesome");
        FeedbackReport report4 = new FeedbackReport(1, "best agent ever!");
        FeedbackReport report5 = new FeedbackReport(1, "kinda sorta");

        System.out.println(report1);

        CustomerAgent badBetty = new CustomerAgent("Betty");
        badBetty.addFeedbackReport(report1);
        badBetty.addFeedbackReport(report3);
        System.out.println(badBetty);

        CustomerAgent goodGeorge = new CustomerAgent("George");
        goodGeorge.addFeedbackReport(report3);
        goodGeorge.addFeedbackReport(report4);
        System.out.println(goodGeorge);







    }
}

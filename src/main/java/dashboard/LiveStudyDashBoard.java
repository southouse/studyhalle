package dashboard;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by southouse
 * Created on 2/4/2021.
 **/
public class LiveStudyDashBoard {
    private static GitHub github;
    private static GHRepository repo;
    private static final int week = 15;

    static {
        try {
            github = new GitHubBuilder().withOAuthToken("a0c681d4e0cd5914473fb5a00c597c58d1492ec2").build();
            repo = github.getRepository("southouse/live-study").getSource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Repository -> Issue -> Comments -> Comment -> User -> Name
     * @return
     * @throws IOException
     */
    public Map<String, Integer> setParticipantUsers() throws IOException {
        Map<String, Integer> participantUser = new HashMap<String, Integer>();
        for (int i = 1; i <= week; i++) {
            List<GHIssueComment> issueComments = repo.getIssue(i).getComments();

            for (GHIssueComment issueComment : issueComments) {
                String userName = issueComment.getUser().getName();
                participantUser.put(userName, i);
            }
        }
        return participantUser;
    }

    public void print(Map<String, Integer> participants) {
        for (String s : participants.keySet()) {
            System.out.println(s + "의 참여율은 " + String.format("%.2f", (double) participants.get(s) * 100 / 18) + "% 입니다.");
        }
    }

}

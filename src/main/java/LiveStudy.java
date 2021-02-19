import dashboard.LiveStudyDashBoard;
import datastructure.ArrayList;

import java.io.IOException;
import java.util.Map;

/**
 * Created by southouse
 * Created on 2/5/2021.
 **/
public class LiveStudy {

    public static void main(String[] args) throws IOException {
        ArrayList numbers = new ArrayList();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(2, 80);
        System.out.println(numbers.toString());
    }

    public void liveStudyDashboardExecute() throws IOException {
        LiveStudyDashBoard liveStudyDashBoard = new LiveStudyDashBoard();

        Map<String, Integer> participants = liveStudyDashBoard.setParticipantUsers();
        liveStudyDashBoard.print(participants);
    }

}

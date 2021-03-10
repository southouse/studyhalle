import dashboard.LiveStudyDashBoard;
import linear.doublylinkedlist.DoublyLinkedList;
import linear.linkedlist.LinkedList;

import java.io.IOException;
import java.util.Map;

/**
 * Created by southouse
 * Created on 2/5/2021.
 **/
public class LiveStudy {

    public static void main(String[] args) throws IOException {
        
        int[] array = {10, 20, 30};
        int size = array.length;
        int[] tmp = new int[3];
        
        System.arraycopy(array, 0, tmp, 0, size - 1);

        for (int i = 0; i < size; i++)
            System.out.println("tmp[" + i + "] = " + tmp[i]);
        
    }

    public void liveStudyDashboardExecute() throws IOException {
        LiveStudyDashBoard liveStudyDashBoard = new LiveStudyDashBoard();

        Map<String, Integer> participants = liveStudyDashBoard.setParticipantUsers();
        liveStudyDashBoard.print(participants);
    }

}

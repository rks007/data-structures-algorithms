import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class nMeetings {
    public static class Meeting{
        Integer startTime;
        Integer finishTime;
        Integer meetingNumber;

        public String toString(){
            return startTime+" "+finishTime;
        }
    }
    public static class meetingComparator implements Comparator<Meeting>{//sort the Meeting on the basis of their finish time in ascending order
        public int compare(Meeting m1, Meeting m2) {
            if (m1.finishTime > m2.finishTime) return 1;
            else if (m1.finishTime < m2.finishTime) return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        List<Integer> start = List.of(1, 3, 0, 5, 8, 5);
        List<Integer> finish = List.of(2, 4, 6, 7, 9, 9);
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < start.size();i++){
            Meeting meet = new Meeting();
            meet.startTime = start.get(i);
            meet.finishTime = finish.get(i);
            meet.meetingNumber = i + 1;
            meetings.add(meet);
        }
        meetings.sort(new meetingComparator());
        System.out.println(meetings);

        List<Integer> result = new ArrayList<>();
        result.add(meetings.get(0).meetingNumber); //store the meeting number not whole meeing remmeber that

        Meeting onGoingMeeting = meetings.get(0);
        for (int i = 1;i < meetings.size();i++){//why i is 1 because we already used 0 when we added it to the result list
            if (onGoingMeeting.finishTime < meetings.get(i).startTime){//if ongoing meeting finish time is less than the next meeting's finish time then add the next meeting number in the result and make it a ongoing meeting
                result.add(meetings.get(i).meetingNumber);
                onGoingMeeting = meetings.get(i);
            }
        }
        System.out.println(result);

    }
}
